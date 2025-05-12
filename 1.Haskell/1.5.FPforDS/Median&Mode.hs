-- Task 5:
-- Implement two functions, `median` and `mode`, to compute:
--  * The median of a non-empty list of Fractional, Ord elements
--  * The mode(s) of a list (most frequent element(s))

import Data.List (sort, group, maximumBy)
import Data.Ord  (comparing)

median :: (Fractional a, Ord a) => [a] -> a
mode :: Ord a => [a] -> [a]
-- TODO: Implement your solution below

main :: IO ()
main = do
    let xs = [1,2,2,3,3,3,4,4]
    putStrLn $ "Median: " ++ show (median xs)  -- Expected: 3.0
    putStrLn $ "Mode: "   ++ show (mode xs)    -- Expected: [3.0]
