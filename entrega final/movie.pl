%actress(_, A, _).
%actress(M, A, _), actor(M, B, _).
%actress(M, A, _), actor(M, B, _), movie(M,Y), mod(Y,2)=:=0.
