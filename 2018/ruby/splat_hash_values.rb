# cerner_2^5_2018
# In ruby, you might be familiar with the array splat syntax

values = [1,2,3]
more_values = [*values, 4] # [1,2,3,4]

# But you can also do this with hashes

values = {a: 1, b: 2}
more_values = {**values, c: 3} # {a: 1, b: 2, c: 3}