### С какими параметрами можно запустить тесты:

* browser.remote - boolean, удаленный запуск или локальный, 
* remote.url - url удаленного ресурса для запуска
* browser.name - название браузера
* browser.version - версия браузера

### Пример запуска тестов
Запуск тестов локально:
```bash
gradle clean test -Dstage=local
```
Запуск тестов удаленно:
```bash
gradle clean test -Dstage=remote
```
Запуск тестов с параметрами:
```bash
gradlew clean test -Dbrowser.remote=true -Dremote.url=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -Dbrowser.name=chrome -Dbrowser.version=90.0
```
