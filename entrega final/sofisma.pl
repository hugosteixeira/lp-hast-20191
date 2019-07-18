sofisma('deus', 'amor').
sofisma('amor', 'cego').
sofisma('steve wonder', 'cego').

sofisma('dieta', 'emagrece').
sofisma('dieta', 'verdura').
sofisma('dieta', 'peixe').
sofisma('peixe', 'baleia').
sofisma('verdura', 'elefante').
sofisma('baleia', 'gordo').
sofisma('elefante', 'gordo').

sofisma('mais queijo', 'mais buracos').
sofisma('mais buracos', 'menos queijo').

check(S, A):-
    sofisma(A, Y),
    sofisma(Y, Z),
    sofisma(S, Z).

%check('steve wonder', 'deus').
%check('dieta','gordo').
%check('mais queijo','menos queijo').


