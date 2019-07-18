import Data.List

fib :: Int -> Int
fib n = fib' 0 1 n
fib' a b 0 = a
fib' a b n = fib' (a+b) a (n-1)

fatorial :: Int -> Int
fatorial 0 = 0 
fatorial 1 = 1
fatorial n = fatorial (n-1) * (n)

nfibs :: Int -> [Int]
nfibs n = take n (map fib [0..])

deleteN :: Int -> [a] -> [a]
deleteN _ []     = []
deleteN i (a:as)
   | i == 0    = as
   | otherwise = a : deleteN (i-1) as

insertAt :: Int -> Int-> [Int] -> [Int] 
insertAt z y xs = as ++ (y:bs)
                  where (as,bs) = splitAt z xs

sepList :: [Int]->([Int],[Int])
sepList = partition even


gio n = jako n ++ tazo n
jako [] = []
jako (a:b) = if a `mod` 2 == 1 then a:jako b else jako b
tazo [] = []
tazo (a:b) = if a `mod` 2 == 0 then a:tazo b else tazo b

main = do
  print(fib 1000)
  print(fatorial 25)
  let listaHugo = nfibs 10
  print(listaHugo)
  let listaHugo1 = deleteN 4 listaHugo
  print(listaHugo1)
  let listaHugo2 = insertAt 1 3 listaHugo
  print(listaHugo2)
  let listaHugo3 = sepList listaHugo
  print(listaHugo3)
  print(gio listaHugo)
