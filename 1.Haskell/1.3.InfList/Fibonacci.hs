-- Task 3:
-- Define an infinite list `fibs` of Fibonacci numbers
-- using lazy evaluation and `zipWith`

fibs :: [Integer]
-- TODO: your implementation below

main :: IO ()
main = print (take 10 fibs)  -- Expected output: [0,1,1,2,3,5,8,13,21,34]
