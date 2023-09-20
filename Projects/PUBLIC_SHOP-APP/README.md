Создать React-проект: 
- `npx create-react-app client --template typescript`
- `npm install`
- `npm start`
Создать Java-проект:
- перейти на [spring.io](https://start.spring.io)
  - Project: Maven
  - Spring Boot  2.7.15, можно более позднюю
  - Project Metadata: 
    - Group: ~~tech.ksergei~~
    - Artifact: ~~shop-library~~
    - Name: ~~shoplibrary~~
    - Description: ~~library for react app~~
    - Package name: ~~tech.ksergei.shoplibrary~~
    - Packaging: Jar
    - Java: 20
  - Dependencies:
    - Spring Data JPA - _сохранение данных в SQL-хранилищах с помощью Java Persistence API с использованием Spring Data и Hibernate_
    - MySQL Driver - _драйвер JDBC для MySQL_
    - Lombok - _создание get,set-методов, конструкторов и многое другое_
    - Rest Repositories - _предоставление доступа к хранилищам данных Spring поверх REST с помощью Spring Data REST_

- Содержимое [application.properties](./backend/src/main/resources/application.properties)

Создание базы данных
- Docker: `docker run --name shop-db -p 8000:3306 -e MYSQL_ROOT_PASSWORD=12345678 -d mysql`

- Стартовый SQL-скрипт [тут](./sql/query.sql)

App.css с заготовками
- [тут](./files/App.css)

## Библиотеки

- Библиотека для роутинга[react-router-dom](https://www.npmjs.com/package/react-router-dom/v/5.0.0) -> `npm i react-router-dom@5.0.0` -> `npm i --save-dev @types/react-router-dom`

### Security
- Нам нужно
 - аутентифицировать пользователя;
 - знать какие действия может выполнять каждый пользователь;
 - делегировать права доступа другому приложению;

__Аутентификация__ – процесс проверки клиента(пользователь\приложение) на предмет того является ли он тем, за кого себя выдаёт. [ _Логин\пароль, токен\ключ, FaceID\TouchID\WinHello_ ]

__Авторизация__ – процесс определения действий, которые может выполнять клиент, т е роль.
  - гость - может читать
  - зарегистрированный пользователь - может оставлять отзывы
  - админ - может удалять\добавлять\редактировать товары

__OAuth2__ [ _авторизация ]

Четыре взаимодействующих субъекта
- Владелец ресурса
- Клиент
- Сервер авторизации (информация о разрешениях) [ _генерирует токены для oauth2\oidc_ ]
- Защищённый ресурс

```
Владелец ресурса        Клиент                     Сервер авторизации          Защищённый ресурс
       │                   │                                   │                          │
       │  <─────────────── │                                   │                          │
       │   Запрос доступа  │                                   │                          │
       │                   │                                   │                          │
       │ ────────────────────────────────────────────────────> │                          │
       │      Владелец может предоставить авторизацию и        │                          │
       │             отправить на сервер авторизации           │                          │
       │                   ┬                                   │                          │
       │                   │ <──────────────────────────────── │                          │
       │                   │  Предоставляет токен авторизации  │                          │
       │                   │        клиентскому приложению     │                          │
       │                   │                                   │                          │
       │                   │ ────────────────────────────────> │                          │
       │                   │      Будет использовать токен     │                          │
       │                   │             авторизации           │                          │
       │                   │                                   │                          │
       │                   │ <──────────────────────────────── │                          │
       │                   │    Обмен информацией: что, как,   │                          │
       │                   │          когда можно делать       │                          │
       │                   │                                   │                          │
       │                   │                                   │                          │
       │                   │ ───────────────────────────────────────────────────────────> │
       │                   │         Отправить маркер доступа к защищенному ресурсу       │
       │                   │                                   ┬                          │
       │                   │                                   │                          │
       │                   │                                   │                          │
       │                   │ <─────────────────────────────────────────────────────────── │
       │                   │             Ресурс вернет данные или информацию или          │
       │                   │                     запрос на расширение прав                │
       │                   │                                   ┬                          │
       │                   │                                   │                          │

```

__OIDC__ [ _OpenID Connect_ ] – аутентификация поверх OAuth2

__JWT__ [ _JSON Web Token_ ] – открытый стандарт, который определяет автономный стандарт описания токенов с помощью безопасной цифровой подписи, гарантирующий целостность данных.
  Используется в OIDC и OAuth2

[jwt.io](https://jwt.io)
`eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImlAa3NlcmdleS5ydSIsIm5hbWUiOiJzZXJnZWkga2EuIiwicm9sZSI6ImFkbWluIn0.zQcRP4EknfLD_vW-ZOg6qWqSODfOFg843y2S9ujgLIs`

__HEADER:ALGORITHM & TOKEN TYPE__ – описывает алгоритм в том типе токена, который они используют
__PAYLOAD:DATA__ – полезная нагрузка, любой тип контента (не передавать много т к гоняется туда-сюда постоянно)
__VERIFY SIGNATURE__ – проверка подписи, гарантируем целостность токена

1. Создать бесплатную учётку http://developers.okta.com
2. Создать клиент и добавить в OIDC в okta
3. Установить необходимые библиотеки
4. Настроить конфигурацию в приложении для работы с OIDC
5. Создать и добавить виджет входа
6. Добавить конфигурацию в приложение
7. Спроектировать, сконфигурировать и описать новые защищенные endpoint'ы
8. Описать возможность входа\выхода из системы

### Полезная информация по Okta
- [devforum](https://devforum.okta.com)
- [github](https://github.com/oktadev/schematics)
- [github okta-widget](https://github.com/okta/okta-signin-widget)

### Добавление Okta в React-проект
Регистрация через [developer.okta.com](https://developer.okta.com)
- `npm install @okta/okta-react@6.4.3`
- `npm i @okta/okta-signin-widget@6.3.3`

### Добавление Okta в Java-проект
```
<dependency>
    <groupId>com.okta.spring</groupId>
    <artifactId>okta-spring-boot-starter</artifactId>
    <version>3.0.4</version>
</dependency>
```
- Дополнительная информация [url](https://mvnrepository.com/artifact/com.okta.spring/okta-spring-boot-starter/3.0.4)

\* _отказывался работать с последними версиями_