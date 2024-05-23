# Тестовое задание для практикантов

## Легенда
Ты java backend разработчик в поисках новой работы. К тебе обращается небольшая компания “РомашкаКо”, 
у которой есть интернет магазин “МоиТовары”. Компания хочет, чтобы ты сделал REST API для интернет магазина.

## Подготовка
Для того чтобы выполнить заказ, тебе нужно настроить рабочее окружение.

### Настройка рабочего места
* Установи JDK (версия java 8+)
* Установи среду разработки (IDE). Её можно выбрать любую, но предпочтительнее IntelliJ IDEA
* Установи maven для сборки проекта
* Установи git для версионирования

Для решения заданий есть ряд общих правил.

### Общие функциональные требования для всех заданий
* Проект можно создать в любом удобном для тебя репозитории
* Репозиторий должен быть открытым
* Основная ветка проекта в git - main
* Для решения задачи 1 нужно в git от master отвести ветку и назвать t1, для задачи 2 отвести ветку t2 от ветки t1 и т.д.
* Использовать архитектурный стиль REST для построения API
* Использовать json для запросов и ответов в API
* Сборка проекта должна осуществляться через maven - можно сделать скрипт сборки проекта для удобства
* Документацию по проекту (эндпоинтам) хранить в README.md

Если в функциональных или бизнес требованиях указан пункт с пометкой **Бонус**, то эти требования не обязательные, 
но дают дополнительные бонусы при решении задачи.

Также в заданиях есть документация, которую можно почитать для решения заданий. 
Если что-то недоступно или неактуально просьба сообщить об этом.

## Задание 1. Базовая реализация REST API
Для решения задания тебе пригодятся следующие инструменты:
* Для самопроверки в части запросов к api можно использовать инструмент Postman или любой другой на твой выбор

Полезно будет почитать:
* [maven официальная документация](https://maven.apache.org/guides/index.html) или [сборка java-проекта с maven](https://spring-projects.ru/guides/maven/)
* [информация про spring boot](https://spring-projects.ru/projects/spring-boot/) и [немного основного про создание rest api на spring boot](https://spring-projects.ru/guides/rest-service/)
* [небольшая документация по postman](https://blog.skillfactory.ru/glossary/postman/)
* [немного про rest api](https://habr.com/ru/articles/447322/)


### Легенда
У компании “РомашкаКо” есть большой ассортимент различных товаров. Они хотят, чтобы пользователи могли через их интернет 
магазин знакомится с ассортиментом. Для этого они попросили тебя создать небольшой REST API для работы с товарами.

### Функциональные требования
1. Используя maven подключить библиотеки Spring (Spring Boot) для решения данной задачи
2. В данном задании хранить товары в какой-то внутренней коллекции (не использовать базу данных)
3. **Бонус** Покрыть тестами, используя фреймворк JUnit, часть функционала
4. **Бонус** Унифицированные ошибки - реализация json ошибок

### Бизнес требования
1. Заказчик хочет получить полный CRUD по товарам:
   1. Получать список товаров
   2. Получать отдельный товар
   3. Создавать товар
   4. Изменять товар
   5. Удалять товар
2. Товар должен содержать следующие поля:
   1. Название товара
   2. Описание товара
   3. Цена товара
   4. В наличии ли товар
3. Должны выполняться проверки на ограничения полей:
   1. Название товара ограничено 255 символами и оно обязательно при создании
   2. Описание товара ограничено 4096 символами
   3. Цена товара не может быть меньше 0, по умолчанию 0
4. Если при создании не указано наличие товара явно, то по умолчанию товар не в наличии

### Какие навыки проверяем
1. Работу с git
2. Работу с maven
3. Использование Spring / Написание кода
4. Понимание абстракции слоев приложения

## Задание 2. Подключение базы данных
Для решения задания тебе пригодятся следующие инструменты:
* Для проверки запросов к СУБД postgres можно использовать инструмент pgAdmin или любой другой удобный инструмент

Полезно будет почитать:
* [основная информация по sql](https://www.w3schools.com/sql/default.asp)
* [официальная документация по postgres](https://www.postgresql.org/docs/current/)
* [инструкция как подключить postgres](https://javarush.com/groups/posts/2579-dobavljaem-bd-k-restful-servisu-na-spring-boot-chastjh-1)

### Легенда
Случился скачок электроэнергии в результате чего сервер интернет магазина “МоиТовары” компании “РомашкаКо” перезагрузился. 
При перезагрузке заново запустилось твоё приложение и оказалось, что вся информация по товарам, 
которую компания добавила через твой api потерялась. Заказчик оказался не доволен и попросил тебя решить проблему 
с сохранением данных.

### Функциональные требования
1. Использовать СУБД Postgres
2. **Бонус** Создание таблиц происходит при запуске приложения, если таких таблиц нет в СУБД
3. **Бонус** Добавить ограничения на столбцы, где нужно, в соответствии с бизнес требованиями из задания 1

### Бизнес требования
1. При перезапуске приложения, данные не должны теряться

### Какие навыки проверяем
1. Умение работать с базой

## Задание 3. Использование Docker
Для решения задания тебе пригодятся следующие инструменты:
* нужно установить docker и docker-compose

Полезно будет почитать:
* [официальная документация по docker](https://docs.docker.com/)
* [официальная документация по docker-compose](https://docs.docker.com/compose/)
* [небольшой пример докеризации java приложения](https://www.baeldung.com/java-dockerize-app)

### Легенда
Прошло какое-то время и оказалось, что сервер компании “РомашкаКо” для интернет магазина уже не справляется с нагрузкой 
и было решено закупить более мощный сервер. После покупки сервера и переноса базы и приложения, 
при запуске твоего приложения возникают ошибки. Заказчику не нравится, что при каждом обновлении системы 
или железа нужно вызвать тебя для настройки приложения и он предлагает решить тебе эту задачу.

### Функциональные требования
1. Для решения задачи использовать Docker. Для этого тебе придется его установить
2. **Бонус** Убрать СУБД postgres в Docker
3. **Бонус** Для запуска использовать docker-compose. Для этого тебе придется его установить

### Бизнес требования
1. Приложение должно запускаться на различных конфигурациях сервера (ОС, различная конфигурация ОС, различный набор вспомогательных программ).

### Какие навыки проверяем
1. Работа с docker

## Задание 4. Добавление фильтрации и сортировки
### Легенда
Прошло немного времени и интернет магазин “МоиТовары” стал популярный. Стало появляться больше товаров и пользователям 
стало сложнее искать нужное. Тогда компания “РомашкаКо” решает добавить на сайт поиск товаров, а также выводить пользователям 
первые N товаров по запросу и просит тебя помочь доработать api.

### Функциональные требования
1. Фильтрация и сортировка должна осуществляться через параметры запроса
2. Валидировать значения фильтрации и сортировки
3. **Бонус** Фильтры и сортировки можно применять вместе
4. **Бонус** Написаны JUnit тесты на сортировку и фильтрацию

### Бизнес требования
1. Должны уметь фильтровать:
   1. по названию или части названия товара
   2. по цене товара, а также больше или меньше заданной цены
   3. по наличию товара
2. Нужно уметь сортировать:
   1. по имени товара
   2. по цене товара
3. **Бонус** Ограничивать выборку заданным количеством записей, которое передает пользователь

### Какие навыки проверяем
1. Работа со Spring
2. Работа с кодом
3. Работа с SQL

## Задание 5 Бонус. Добавление продаж через сайт
###Легенда
Многим пользователям понравится ассортимент в интернет магазине “МоиТовары” и они хотели бы покупать товар через сайт. 
Компания “РомашкаКо” решает добавить такую возможность и опять на помощь призывает тебя.

### Функциональные требования
1. **Бонус** Покрыть JUnit тестами новые эндпоинты

### Бизнес требования
1. Добавить CRUD для новой сущности “Поставка товара”. Данный документ говорит сколько товара поставили для продажи.
2. Поля сущности “Поставка товара”:
   1. Название документа
   2. Товар, который поставили для продажи
   3. Количество поставленного товара
3. Ограничения полей сущности “Поставка товара”:
   1. Название документа ограниченно 255 символами
   2. Товар должен быть существующим
   3. Количество товара в документе должно быть больше 0
4. Аналогично добавить CRUD для новой сущности “Продажа товара”. Данный документ говорит сколько товара было продано
5. Поля сущности “Продажа товара”:
   1. Название документа
   2. Товар, который был продан
   3. Количество проданного товара
6. Ограничение полей сущности “Продажа товара”:
   1. Название документа ограниченно 255 символами
   2. Товар должен существовать
   3. Количество товара в документе должно быть больше 0
   4. Нельзя продавать в минус по количеству товара
7. **Бонус** В документе “Продажа товара” добавить поле стоимость покупки
8. **Бонус** В товаре менять поле в наличии, при изменении количества товара или выводить количество товара.

### Какие навыки проверяем
1. Умение работать с нетривиальным, сложным кодом
2. Подход к типовым решениям/шаблоны/DRY|KISS|SOLID и т.д.

## Задание 6. Ревью задания
В этой части мы будем спрашивать тебя по выполненному заданию, а также можем попросить немного расширить 
приложение по аналогии со сделанным. 