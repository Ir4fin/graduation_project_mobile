# Проект по автоматизации тестирования приложения Wikipedia mobile
## 📑 Содержание
- [Стек проекта](https://github.com/Ir4fin/graduation_project_mobile/tree/main#%EF%B8%8F-%D1%81%D1%82%D0%B5%D0%BA-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B0)
- [Текущее тестовое покрытие](https://github.com/Ir4fin/graduation_project_mobile/blob/main/README.md#%EF%B8%8F-%D1%82%D0%B5%D0%BA%D1%83%D1%89%D0%B5%D0%B5-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BF%D0%BE%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5)
- [Запуск тестов](https://github.com/Ir4fin/graduation_project_mobile/blob/main/README.md#-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
- [Проект в Allure TestOps](https://github.com/Ir4fin/graduation_project_mobile/blob/main/README.md#keyboard-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82-%D0%B2-allure-testops)
- [Пример Allure отчёта по пройденным тестам](https://github.com/Ir4fin/graduation_project_mobile/blob/main/README.md#-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-allure-%D0%BE%D1%82%D1%87%D0%B5%D1%82%D0%B0-%D0%BF%D0%BE-%D0%BF%D1%80%D0%BE%D0%B9%D0%B4%D0%B5%D0%BD%D0%BD%D1%8B%D0%BC-%D1%82%D0%B5%D1%81%D1%82%D0%B0%D0%BC)
- [Пример видео из Allure отчёта]
- [Уведомления]

## ⚙️ Стек проекта

<p align="center">
<img width="6%" title="Android Studio" src="images/AndroidStudio.svg">
<img width="6%" title="Appium" src="images/Appium.svg">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/Java.svg">
<img width="6%" title="Selenide" src="images/Selenide.svg">
<img width="6%" title="Allure Report" src="images/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/Gradle.svg">
<img width="6%" title="JUnit5" src="images/JUnit5.svg">
<img width="6%" title="GitHub" src="images/GitHub.svg">
<img width="6%" title="Jenkins" src="images/Jenkins.svg">
<img width="6%" title="Telegram" src="images/Telegram.svg">
<img width="6%" title="Allure_TO" src="images/Allure_TO.svg">
</p>

## ▶️ Текущее тестовое покрытие

**UI автотесты:**

:white_check_mark: Проверка работы Onboarding Screen

:white_check_mark: Проверка работы поиска и открытия статьи по слову

## 🧮 Запуск тестов

**Удаленный запуска с Browserstack**

`./gradlew clean test -DdeviceHost=browserstack`

**Запуск на эмуляторе Android Studio**

`./gradlew clean test -DdeviceHost=emulation`

**Запуск на локальном устройстве Android**

`./gradlew clean test -DdeviceHost=real`

**Jenkins**

Для проекта сделана [сборка в Jenkins](https://jenkins.autotests.cloud/job/014-Ir4fin-%20graduation_project_mobile_wiki/) со следующими параметрами:

```bash
clean
test
-DdeviceHost=browserstack
```

Для запуска прогона необходимо нажать на "Собрать сейчас"

![This is an image](https://github.com/Ir4fin/graduation_project_mobile/blob/main/images/Screenshot_1.jpg)

## :keyboard: Проект в Allure TestOps

Проект развернут также в Allure TestOps, что позволяет: отслеживать прогон тестов в реальном времени; автоматически добавлять тесты из прогона в тест-кейсы; адаптировать прогоны для того, чтобы их могли разбирать и запускать участники проекта, не связанные напрямую с автотестированием.

![This is an image](https://github.com/Ir4fin/graduation_project_mobile/blob/main/images/Screenshot_2.jpg)
![This is an image](https://github.com/Ir4fin/graduation_project_mobile/blob/main/images/Screenshot_3.jpg)

## 📊 Пример Allure-отчета по пройденным тестам

Для каждого теста прописаны шаги с описанием того, что он делает в процессе прохождения. 

К результатам проверки добавляются итоговый скриншот выполнения теста и видео прохождения.

![This is an image](https://github.com/Ir4fin/graduation_project_mobile/blob/main/images/Screenshot_4.jpg)

## :clapper: Пример видео из Allure отчёта

![](https://github.com/Ir4fin/graduation_project_mobile/blob/main/images/6d154d6d37b932061a99e0998887027c5010eba6.gif)








