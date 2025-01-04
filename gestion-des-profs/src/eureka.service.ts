import { Injectable, OnModuleInit, OnModuleDestroy } from '@nestjs/common';
import * as EurekaClient from './eureka/eureka-client'; // Assure-toi que le chemin est correct



@Injectable()
export class EurekaService {
  private client: any;

  constructor() {
    this.client = EurekaClient;
  }

 
  
}
