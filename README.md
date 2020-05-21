# Umari Datafilter Quickstart

## Utilizando as bibliotecas localmente

Para usar a biblioteca do frontend localmente, [baixe-a](https://github.com/umari-io/ng-umari-datafilter) e execute os comandos da sua raíz

```sh
npm install
ng build --project=ng-umari-datafilter
cd dist/ng-umari-datafilter/
npm link
```

Após a criação Link NPM, remova a dependência do `ng-umari-datafilter` do package.json presente em umari-datafilter-quickstart-frontend. Em seguida execute da raíz desse projeto

```sh
npm install
```

Após isso, coloque de volta a dependência do `ng-umari-datafilter` no package.json, e execute:

```sh
npm link ng-umari-datafilter
ng serve
```

Para usar a biblioteca do backend localmente, [baixe-a](https://github.com/umari-io/umari-datafilter-spring-boot-starter), e execute os comandos abaixo da sua raíz:


```sh
mvn clean package
mvn install:install-file -Dfile=target/umari-datafilter-spring-boot-starter-1.0.0.jar -DpomFile=pom.xml
```

Após a instalação local, execute da raíz desse projeto:

```sh
mvn spring-boot:run
```
