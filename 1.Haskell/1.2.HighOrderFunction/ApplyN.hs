-- Task 2:
-- Implement a higher-order function `applyN` that:
-- 1. Takes a number `n`, a function, and a value
-- 2. Applies the function to the value `n` times
-- 3. Returns a list containing all intermediate results
-- 4. Uses function composition and point-free style where appropriate
-- 5. Handles edge cases (n ≤ 0)

applyN :: Int -> (a -> a) -> a -> [a]
-- TODO: your implementation below

main :: IO ()
main = do
    print (applyN 3 (++ "ha") "ho")  -- Expected: ["ho","hoha","hohaha","hohahaha"]
    print (applyN 4 (*2) 1)          -- Expected: [1,2,4,8,16]
    print (applyN 0 (*2) 5)          -- Expected: [5]
