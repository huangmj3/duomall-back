FROM openjdk

# 时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo Asia/Shanghai > /etc/timezone \
  && dpkg-reconfigure -f noninteractive tzdata

WORKDIR /app/bin

COPY goods-server/target/goods-server-0.0.4-SNAPSHOT.jar ./goods-server.jar

# 日志目录
VOLUME /app/log

EXPOSE 8802

#CMD ["java", "-javaagent:/app/bin/zeus-agent.jar=spring.application.name=goods" ,"-jar", "/app/bin/app.jar"]
CMD ["java","-jar", "/app/bin/goods-server.jar"]
