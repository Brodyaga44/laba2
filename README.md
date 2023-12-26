# BMI  Calculator
>  Описание: В ходе данной работы был разработан калькулятор **[ИМТ](https://en.wikipedia.org/wiki/Body_mass_index)** (Индекс массы тела).
- Технологический стек: Java
- Статус: 1.7.2.
- По сравнению с другими подобными продуктами, данная разработка отличается интуитивно понятным интерфейсом.

  **Скриншот рабочего окна приложения:**
  ----------------------------------------
 ![image](https://github.com/Brodyaga44/Task1/assets/145764043/f684ff0a-41f3-4832-aec4-e30ef2744741)

**Разбор части кода на примере класса BMI**
```
public class BMI {
    private float weight;
    private float height;
    public BMI() {
        this.height = 0;
        this.weight = 0;
    }
    public BMI(float BodyHeight, float BodyMass) {
        this.height = BodyHeight;
        this.weight = BodyMass;
    }
    public float calculate()
    {
        return this.weight/this.height/this.height*10000;
    }
    public String diagnosis(){
        if (18.5 <= calculate() &&  calculate() < 25)
        {
            return "Вывод: Ваш ИМТ в норме";
        }
        else if (calculate() < 25) {
            return "Вывод: У Вас нехватка веса";
        }
        else if (18.5 <= calculate()) {
            return "Вывод: У Вас избыток веса";
        }
        return null;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + this.weight +
                ", height=" + this.height +
                '}';
    }
}
```
------------------------
## Архитектура
> Диаграмма классов:

![image](https://github.com/Brodyaga44/Task1/assets/145764043/2146c4d0-a464-4f38-a00f-69d49dccbcad)
## Завсимости
Для работы данного приложежния необходимы JavaFX и JDK 20.

## Установка
Не требуется. Достаточно запустить проект через любую доступную среду разработки JAVA.

##  Конфигурация
Не требуется

## Применение
> Для работы с ним требуется указать некоторые *параметры*:
1. Массу тела м
2. Рост H
Исходя из полученных значений, подставленных в формулу **bmi = M/H^2**
Получается результат, который сравнивается с данной таблицей
![BMI](https://fizkultura-fgos.ru/wp-content/uploads/0/4/6/0466c04ae9068a1154f5e89d80bf3968.png)

## Проверка ПО
Не предусмотрена

## Проблемы
Плохой дизайн

## Получение справочной информации
По всем вопрсам можно обратиться в [телеграм](https://t.me/YaSimpleDimple) разработчика  

## Приглашение к сотрудничеству 
В дальнейшем предполагается передаботка действующего дизайна интерфейса

## Источники и справочники
- [Что такое BMI?](https://ru.wikipedia.org/wiki/Индекс_массы_тела)
- [Образовательная платформа Stepik](https://stepik.org/learn)

//ссылка, картинка, кусок кода, диаграмма классов
