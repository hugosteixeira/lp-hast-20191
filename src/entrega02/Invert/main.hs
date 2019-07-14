wordsWhen     :: (Char -> Bool) -> String -> [String]
wordsWhen p s =  case dropWhile p s of
                      "" -> []
                      s' -> w : wordsWhen p s''
                            where (w, s'') = break p s'

reverseList  [] = []
reverseList  xs = last xs : reverseList (init xs)

main = do
  let list =  wordsWhen (=='\n') "Não te amo mais.\n\
  \Estarei mentindo dizendo que\n\
  \Ainda te quero como sempre quis.\n\
  \Tenho certeza que\n\
  \Nada foi em vão.\n\
  \Sinto dentro de mim que\n\
  \Você não significa nada.\n\
  \Não poderia dizer jamais que\n\
  \Alimento um grande amor.\n\
  \Sinto cada vez mais que\n\
  \Já te esqueci!\n\
  \E jamais usarei a frase:\n\
  \EU TE AMO!\n\
  \Sinto, mas tenho que dizer a verdade\n\
  \É tarde demais...\n"
  print(reverseList list)
