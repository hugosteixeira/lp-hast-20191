ama('lia', 'lea').
ama('lea', 'paulo').
ama('paulo', 'juca').
ama('dito', 'rita').
ama('rita', 'dito').
ama('rita', 'carlos').
ama('juca', 'dora').
ama('dora', 'carlos').
ama('dora', 'rita').
ama('carlos', 'dora').
ama('dora', 'lia').
ama('dora', 'pedro').
ama('dora', 'lea').
ama('dora', 'juca').
ama('dora', 'paulo').
rival(A, B):-
    ama(A, C),
    ama(B, C),
    A \= B.
casal(A,B):-
    ama(B,A),
    ama(A,B),
    A @< B.
