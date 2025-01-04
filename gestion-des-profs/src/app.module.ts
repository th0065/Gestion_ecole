import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { ConfigModule } from '@nestjs/config'; // Import ConfigModule
import { Prof } from './profs/entities/prof.entity';
import { ProfsController } from './profs/profs.controller';
import { ProfsService } from './profs/profs.service';
import { EurekaService } from './eureka.service';

@Module({
  imports: [
    ConfigModule.forRoot({
      isGlobal: true, // Make the configuration globally available
    }),
    TypeOrmModule.forRoot({
      type: 'postgres', // Change to 'postgres' as you're using PostgreSQL
      host: process.env.DB_HOST, // Use the environment variable
      port: parseInt(process.env.DB_PORT, 10), // Parse the port as an integer
      username: process.env.DB_USERNAME,
      password: process.env.DB_PASSWORD,
      database: process.env.DB_NAME,
      entities: [Prof],
      synchronize: true, // Set to false in production for better control over schema changes
    }),
    TypeOrmModule.forFeature([Prof]), // Import Prof entity for use in the app
  ],
  controllers:[ProfsController],
  providers:[ProfsService,EurekaService],
})
export class AppModule {}


