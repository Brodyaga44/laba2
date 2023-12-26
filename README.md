# Iterator
>  Описание: В ходе данной работы был разработан  **Iterator**.
- Технологический стек: Java
- Статус: 1.2
- По сравнению с другими подобными продуктами, данная разработка отличается интуитивно понятным интерфейсом.

  **Скриншот рабочего окна приложения:**
  ----------------------------------------
 ![image](![image](https://github.com/Brodyaga44/laba2/assets/145764043/2b333fa4-4b2f-41e8-9beb-cc9477f66e34)
)

**Разбор части кода на примере класса HelloController**
```
@FXML
    public void onLastClick(){
        if (iterator.hasPreview()) imageView.setImage(iterator.preview());
        else {
            while(iterator.hasNext()) {
                iterator.next();
            }
            iterator.preview();
            imageView.setImage(iterator.next());
        }
    }
    @FXML
    public void onNextClick(){
        if (iterator.hasNext()) imageView.setImage(iterator.next());
        else {
            iterator = foto.getIterator();
            imageView.setImage(iterator.next());
        }
    }
```
------------------------
## Архитектура
> Диаграмма классов:

![image](![imagetest](https://github.com/Brodyaga44/laba2/assets/145764043/ae0783de-b0b3-4cc8-884b-9036b145861e)
)
## Завсимости
Для работы данного приложежния необходимы JavaFX и JDK 20.

## Установка
Не требуется. Достаточно запустить проект через любую доступную среду разработки JAVA.

##  Конфигурация
Не требуется

## Применение
> Для работы с ним требуется поместить фотографии для слайд шоу в папку  *resourses* внутир проекта
1. Кнопка *слайдшоу* - начинает показ анимации
2. Кнопка *стоп слайдшоу* - останавливает
3. Кнопка вперед - включает следующее фото
4. кнопка назад - включает предыдущее фото

## Проблемы
Плохой дизайн

## Получение справочной информации
По всем вопрсам можно обратиться в [телеграм](https://t.me/YaSimpleDimple) разработчика  

## Приглашение к сотрудничеству 
В дальнейшем предполагается передаботка действующего дизайна интерфейса

## Источники и справочники
- [Что такое Iterator?]([https://ru.wikipedia.org/wiki/Индекс_массы_тела](https://ru.wikipedia.org/wiki/Итератор))
- [Образовательная платформа Stepik](https://stepik.org/learn)

//ссылка, картинка, кусок кода, диаграмма классов
