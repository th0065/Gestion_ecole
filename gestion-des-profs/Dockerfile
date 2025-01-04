FROM node:20.10.1
VOLUME /tmp 
COPY package*.json ./
RUN npm install
COPY . .
RUN npm build
EXPOSE 3000
CMD ["node", "dist/main"]