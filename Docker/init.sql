\c postgres
CREATE TABLE PureVorm(
    id int PRIMARY KEY,
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO PureVorm
    (id, name, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (1, 'Espresso', 'Italië', '1900', 'Koffie', 'onder druk'),
    (2, 'Caffè americano', 'Europa', '1945', 'Water', 'Amerikaanse soldaten'),
    (3, 'Groene Koffie', 'Arabië', '1100 na Christus', 'Groene bonen', 'Arabische Koffie'),
    (4, 'Marokkaanse Koffie', 'Marokko', '1900', 'Arabica koffiebonen', 'komt uit Marokko'),
    (5, 'Ristretto', 'Italië', '1952', 'Gekaramelliseerde suikers', 'Italiaans voor beperkt'),
    (6, 'Caffè lungo', 'Italië', '1941', 'Veel water', 'Italiaans voor lange koffie');

CREATE TABLE IjsVorm(
    id int PRIMARY KEY,
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO IjsVorm
    (id, name, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (1, 'Café liégeois ', 'België', '1918', 'Karamel', 'Nederlands voor Luikse koffie'),
    (2, 'Frappé', 'Thessaloniki in Griekenland', '1957', 'Gebroken ijs', 'Grieks voor geslagen'),
    (3, 'IJs koffie', 'Italië', '1925', 'sterke koffie', 'Koffie met ijs'),
    (4, 'Shakerato', 'Marokko', '1900', 'Arabica koffiebonen', '');

CREATE TABLE MelkEnRoomVorm(
    id int PRIMARY KEY,
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO MelkEnRoomVorm
    (id, name, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (1, 'Caffè latte', 'VS', '1995', 'Warme melk', 'Koffie met melk'),
    (2, 'Caffè macchiato', 'VS', '1995', 'Beetje melkschuim', 'Gevlekte koffie'),
    (3, 'Koffie verkeerd', 'Nederland', '1900', 'Veel warme melk', 'Veel melk'),
    (4, 'Cappuccino', 'Wenen', '1952', 'Melkschuim', 'Duits is het Kapuziner Kaffee'),
    (5, 'Wienermelange', 'Italië', '1941', 'veel soorten bonen', 'Bonenmelange'),
    (6, 'Einspänner', 'Wenen', '1945', 'dikke  laag slagroom', 'Eenspan, één paard');

CREATE TABLE AlcoholischeVorm(
    id int PRIMARY KEY,
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO AlcoholischeVorm
    (id, name, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (1, 'Barraquito', 'Spanje', '1900', 'laag gecondenseerde melk', ''),
    (2, 'Carajillo', 'Spanje', '1945', 'Tia Maria', ''),
    (3, 'Dokkumer koffie', 'Friesland', '', 'Sheut beerenburg', 'Oorspronkelijk met de Dokkumer Sonnema Berenburg en Friese stad Dokkum'),
    (4, 'French coffee', 'Frankrijk', '', 'een scheut Grand Marnier of Cointreau-likeur', 'Franse koffie'),
    (5, 'Hasseltse koffie', 'België', '', 'Jenever', 'komt uit belgië'),
    (6, 'Irish coffee', 'Ierland', '1942', 'Bruine basterdsuiker', 'komt uit Ierland'),
    (7, 'Italian coffee', 'Italië', '', 'amaretto', 'komt uit Italië'),
    (8, 'Limburgse koffie', 'Limburg', '', 'Gember', 'komt uit Limburg'),
    (9, 'Pharisäer', 'Noord-Friesland', '', 'Rum', 'jullie Farizeeën'),
    (10, 'Ponce', 'Livorno Italië', '', 'Rum', '');

CREATE TABLE TheeVorm(
    id int PRIMARY KEY,
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO TheeVorm
    (id, name, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (1, 'Yuengyueng', 'Hong-Kong', '2010', 'Melkthee', 'Koffie met thee'),
    (2, 'Backwoods Twisted Palm Tree', 'Europa', '1960', '', '');

CREATE TABLE EiVorm(
    id int PRIMARY KEY,
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO EiVorm
    (id, name, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (1, 'Noorse eierKoffie', 'Noorwegen', '1910', 'Rauw ei', 'komt uit Noorwegen'),
    (2, 'Vietnamese eierkoffie', 'Vietnam', '1918', '2 eierdooiers', 'komt uit Vietnam'),
    (3, 'Zweedse eierKoffie', 'Zweden', '1910', 'Rauw ei', 'komt uit Zweden');