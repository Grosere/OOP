Задание №1 __Магазин__
<span style="color:Green">Задача: </span>
<span style="color:Green">1. Создать класс Товар, имеющий переменные имя, цена, рейтинг.</span>
<span style="color:Green">2. Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.</span>
<span style="color:Green">3. Создать класс Basket, содержащий массив купленных товаров.</span>
<span style="color:Green">4. Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.</span>
<span style="color:Green">5. Вывести на консоль каталог продуктов. (все продукты магазина)</span>
<span style="color:Green">6. Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)</span>

Данный репозиторий:

1. Содержит некий перечень товаров;
2. Содержит перечень пользователей магазина;
3. Реализует консольную имитацию их покупки;
4. Производит вывод состояний магазина до покупок и после.
Торговля показана на примере 2х известных экономических категорий - __Торты__ и __Машины__. 


___ Класс <span style="color:CadetBlue"> Product </span> содержит атрибуты товаров: ___
>> <span style="color:blue"> id </span> и его статический счётчик <span style="color:Cyan">counterId</span>;
>> 
>> <span style="color:blue"> name </span> - имя;
>> 
>> <span style="color:blue"> price </span> - цену;
>> 
>> <span style="color:blue"> rating </span> - рейтинг, а также конструктор по этим полям, геттеры, стрингификатор объекта;
>> 
>> метод изменения рейтинга и количества товара при его покупке.

___ Класс <span style="color:CadetBlue"> Category </span> содержит атрибуты категории товаров: ___
>> <span style="color:blue"> id </span> и его статический счётчик <span style="color:Cyan">counterId</span>;
>> 
>> <span style="color:blue"> name </span> - имя;
>> 
>> <span style="color:blue"> products </span> - словарь продуктов категории, а также два конструктора (для пустой категории и с наполнением), геттеры, стрингификатор категории (включая входящие в неё товары), методы добавления и исключения товаров, получения содержимого категории.

___ Класс <span style="color:CadetBlue">Basket</span> содержит атрибуты перечня покупок: ___
>> <span style="color:blue"> id </span> и его статический счётчик <span style="color:Cyan">counterId</span>;
>> 
>> <span style="color:blue"> name </span> - имя;
>> 
>> <span style="color:blue">purchasedProducts </span> - словарь <span style="color:blue"> id </span> купленных продуктов, а также конструктор, геттеры, стрингификатор корзины, методы добавления и исключения товаров, получения содержимого корзины в виде набора <span style="color:blue"> id </span>.
>>

___ Класс <span style="color:CadetBlue"> User </span> содержит атрибуты пользователей: ___
>> <span style="color:blue"> id </span> и его статический счётчик <span style="color:Cyan">counterId</span>;
>> 
>><span style="color:blue">login</span> - логин;
>>
>><span style="color:blue"> password </span> - пароль (доступ к нему полностью закрыт, до реализации авторизации),
>>
>><span style="color:blue"> basket </span> - экземпляр корзины, а также конструктор, геттеры, стрингификатор аккаунта.
>>

___ Класс <span style="color:CadetBlue">Shop</span> содержит: ___
>><span style="color:blue">categories</span> - массив категорий товаров;
>>
>><span style="color:blue">users</span> - словарь пользователей, инициализирует товары в магазине, категории, пользователей, производит торги, содержит стрингификатор массива категорий, метод получения товара по <span style="color:blue"> id </span>, необходимый для работы метода проведения покупки (с учётом количества покупаемого, наличия товара).
>>

___ Класс <span style="color:CadetBlue">Main</span>, созданием экземпляра класса <span style="color:CadetBlue">Shop</span>, и вызывом основного метода <span style="color:Yellow">trade()</span> осуществляем имитацию торговли. ___

Задачу выполнял: Козменко Сергей

Поток: Разработчик — Программист. Специализация

Группа: 5452
