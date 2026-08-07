import { Module } from '@nestjs/common';
import { ConfigModule, ConfigService } from '@nestjs/config';
import { TypeOrmModule } from '@nestjs/typeorm';
import { config as parseEnvFile } from 'dotenv';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { AuthModule } from './auth/auth.module';
import { Comment } from './posts/entities/comment.entity';
import { Like } from './posts/entities/like.entity';
import { Post } from './posts/entities/post.entity';
import { PostsModule } from './posts/posts.module';
import { User } from './users/entities/user.entity';
import { UsersModule } from './users/users.module';

@Module({
  imports: [
    ConfigModule.forRoot({
      isGlobal: true,
      // Carrega o .env local dentro do "internalConfig" do ConfigService, que
      // tem precedência sobre process.env. Assim as variáveis definidas no .env
      // deste projeto vencem eventuais variáveis globais da máquina com o mesmo
      // nome (ex.: DB_HOST/DB_NAME/DB_PASSWORD de outros projetos).
      load: [() => parseEnvFile().parsed ?? {}],
    }),
    TypeOrmModule.forRootAsync({
      imports: [ConfigModule],
      inject: [ConfigService],
      useFactory: (config: ConfigService) => ({
        type: 'postgres',
        host: config.get<string>('DB_HOST', 'localhost'),
        port: config.get<number>('DB_PORT', 5432),
        username: config.get<string>('DB_USERNAME', 'codeconnect'),
        password: config.get<string>('DB_PASSWORD', 'codeconnect'),
        database: config.get<string>('DB_NAME', 'codeconnect'),
        entities: [User, Post, Comment, Like],
        synchronize: true,
      }),
    }),
    UsersModule,
    AuthModule,
    PostsModule,
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
