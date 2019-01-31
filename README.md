# Rastreabilidade entre dois projetos com Jaeger, Zuul e Eureka

Passo a passo:

- Iniciar Eureka<br />
``
localhost:8761
``

- Iniciar Zuul

- Iniciar serviço geo-ms

- Iniciar serviço roteirizador-ms

- Iniciar jaeger all-in-one:<br />
``
jaeger-all-in-one --collector.zipkin.http-port=9411
``

- Executar serviço no roteirizador-ms acessando pelo zuul:<br />
Sem erro:<br />
``
http://localhost:8762/roteirizadorms/roteirizador/helloError
``
<br /><br />Com erro proposital para analisar o erro no jaeger:<br />
``
http://localhost:8762/roteirizadorms/roteirizador/hello
``

- Verficar rastreabilidade:<br />
``
http://localhost:16686
``

![alt text](https://github.com/cesarschutz/jaeger-rastreando-dois-projetos-spring-boot/blob/master/Capturar.PNG)
