# Umari Datafilter Quickstart

## Utilizando as bibliotecas localmente

Para usar a biblioteca do frontend localmente, [baixe-a](https://github.com/umari-io/ng-umari-datafilter) e execute os comandos da sua raíz

```sh
ng build --project=ng-umari-datafilter
cd dist/ng-umari-datafilter/
npm link
```

Após a criação Link NPM, execute da raíz desse projeto

```sh
cd umari-datafilter-quickstart-frontend/
npm link ng-umari-datafilter
```

Para usar a biblioteca do backend localmente, [baixe-a](https://github.com/umari-io/umari-datafilter-spring-boot-starter), faça Maven Install, e em seguisa force a atualização das dependências deste projeto
