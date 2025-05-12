-- Task 4:
-- Implement `mergeSort` to sort a list of any orderable elements

mergeSort :: Ord a => [a] -> [a]
-- TODO: Implement your solution below

main :: IO ()
main = print (mergeSort [5,2,9,1,5,6])  -- Expected output: [1,2,5,5,6,9]
