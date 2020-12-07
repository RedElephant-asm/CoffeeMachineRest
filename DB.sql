CREATE TABLE Drinks
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name TEXT(30),
    portionCount INT,
    price INT
);

INSERT INTO Drinks
VALUES
(NULL, 'Espresso', 100, 54),
(NULL, 'Double Espresso', 100, 108),
(NULL, 'Red Eye', 100, 27),
(NULL, 'Black Eye', 100, 53),
(NULL, 'Americano', 100, 76),
(NULL, 'Long Black', 100, 43),
(NULL, 'Macchiato', 100, 86),
(NULL, 'Long Macchiato', 100, 43),
(NULL, 'Cortado', 100, 36),
(NULL, 'Breve', 100, 56),
(NULL, 'Cappuccino', 100, 32),
(NULL, 'Flat While', 100, 54),
(NULL, 'Cafe Latte', 100, 65),
(NULL, 'Mocha', 100, 76),
(NULL, 'Vienna', 100, 34),
(NULL, 'Affogato', 100, 35),
(NULL, 'Cafe au Lait', 100, 67),
(NULL, 'Ised Coffee', 100, 65);