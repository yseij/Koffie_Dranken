\c postgres

CREATE SEQUENCE KoffieSoorten_sequence
  start 1
  increment 1;
  
CREATE TABLE KoffieSoorten(
    id SERIAL PRIMARY KEY,
    soort varchar(255),
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO KoffieSoorten
    (id, name, soort, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (nextval('KoffieSoorten_sequence'), 'Espresso', 'PureVorm','Italië', '1900', 'Koffie', 'onder druk'),
    (nextval('KoffieSoorten_sequence'), 'Caffè americano', 'PureVorm','Europa', '1945', 'Water', 'Amerikaanse soldaten'),
    (nextval('KoffieSoorten_sequence'), 'Groene Koffie', 'PureVorm','Arabië', '1100', 'Groene bonen', 'Arabische Koffie');
    -- (4, 'Marokkaanse Koffie', 'PureVorm','Marokko', '1900', 'Arabica koffiebonen', 'komt uit Marokko'),
    -- (5, 'Ristretto', 'PureVorm','Italië', '1952', 'Gekaramelliseerde suikers', 'Italiaans voor beperkt'),
    -- (6, 'Caffè lungo', 'PureVorm','Italië', '1941', 'Veel water', 'Italiaans voor lange koffie'),
    -- (7, 'Café liégeois ', 'IjsVorm','België', '1918', 'Karamel', 'Nederlands voor Luikse koffie'),
    -- (8, 'Frappé', 'IjsVorm','Thessaloniki in Griekenland', '1957', 'Gebroken ijs', 'Grieks voor geslagen'),
    -- (9, 'IJs koffie', 'IjsVorm','Italië', '1925', 'sterke koffie', 'Koffie met ijs'),
    -- (10, 'Shakerato', 'IjsVorm','Marokko', '1900', 'Arabica koffiebonen', ''),
    -- (11, 'Caffè latte', 'MelkEnRoomVorm','VS', '1995', 'Warme melk', 'Koffie met melk'),
    -- (12, 'Caffè macchiato', 'MelkEnRoomVorm','VS', '1995', 'Beetje melkschuim', 'Gevlekte koffie'),
    -- (13, 'Koffie verkeerd', 'MelkEnRoomVorm','Nederland', '1900', 'Veel warme melk', 'Veel melk'),
    -- (14, 'Cappuccino', 'MelkEnRoomVorm','Wenen', '1952', 'Melkschuim', 'Duits is het Kapuziner Kaffee'),
    -- (15, 'Wienermelange', 'MelkEnRoomVorm','Italië', '1941', 'veel soorten bonen', 'Bonenmelange'),
    -- (16, 'Einspänner', 'MelkEnRoomVorm','Wenen', '1945', 'dikke  laag slagroom', 'Eenspan, één paard'),
    -- (17, 'Caffè latte', 'MelkEnRoomVorm','VS', '1995', 'Warme melk', 'Koffie met melk'),
    -- (18, 'Caffè macchiato', 'MelkEnRoomVorm','VS', '1995', 'Beetje melkschuim', 'Gevlekte koffie'),
    -- (19, 'Koffie verkeerd', 'MelkEnRoomVorm','Nederland', '1900', 'Veel warme melk', 'Veel melk'),
    -- (20, 'Cappuccino', 'MelkEnRoomVorm','Wenen', '1952', 'Melkschuim', 'Duits is het Kapuziner Kaffee'),
    -- (21, 'Wienermelange', 'MelkEnRoomVorm','Italië', '1941', 'veel soorten bonen', 'Bonenmelange'),
    -- (22, 'Einspänner', 'MelkEnRoomVorm','Wenen', '1945', 'dikke  laag slagroom', 'Eenspan, één paard'),
    -- (23, 'Barraquito', 'AlcoholischeVorm','Spanje', '1900', 'laag gecondenseerde melk', ''),
    -- (24, 'Carajillo', 'AlcoholischeVorm','Spanje', '1945', 'Tia Maria', ''),
    -- (25, 'Dokkumer koffie', 'AlcoholischeVorm','Friesland', '', 'Sheut beerenburg', 'Oorspronkelijk met de Dokkumer Sonnema Berenburg en Friese stad Dokkum'),
    -- (26, 'French coffee', 'AlcoholischeVorm','Frankrijk', '', 'een scheut Grand Marnier of Cointreau-likeur', 'Franse koffie'),
    -- (27, 'Hasseltse koffie', 'AlcoholischeVorm','België', '', 'Jenever', 'komt uit belgië'),
    -- (28, 'Irish coffee', 'AlcoholischeVorm','Ierland', '1942', 'Bruine basterdsuiker', 'komt uit Ierland'),
    -- (29, 'Italian coffee', 'AlcoholischeVorm','Italië', '', 'amaretto', 'komt uit Italië'),
    -- (30, 'Limburgse koffie', 'AlcoholischeVorm','Limburg', '', 'Gember', 'komt uit Limburg'),
    -- (31, 'Pharisäer', 'AlcoholischeVorm','Noord-Friesland', '', 'Rum', 'jullie Farizeeën'),
    -- (32, 'Ponce', 'AlcoholischeVorm','Livorno Italië', '', 'Rum', ''),
    -- (33, 'Yuengyueng', 'TheeVorm','Hong-Kong', '2010', 'Melkthee', 'Koffie met thee'),
    -- (34, 'Backwoods Twisted Palm Tree', 'TheeVorm','Europa', '1960', '', ''),
    -- (35, 'Noorse eierKoffie', 'EiVorm','Noorwegen', '1910', 'Rauw ei', 'komt uit Noorwegen'),
    -- (36, 'Vietnamese eierkoffie', 'EiVorm','Vietnam', '1918', '2 eierdooiers', 'komt uit Vietnam'),
    -- (37, 'Zweedse eierKoffie', 'EiVorm','Zweden', '1910', 'Rauw ei', 'komt uit Zweden');