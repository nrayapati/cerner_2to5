# When you parse json in ruby it is placed into a hash, and you have to access the values with hash syntax:
# cerner_2^5_2018

parsed_data = JSON.parse('{"color": "blue"}')
puts parsed_data["color"] # prints 'blue'

# But instead of a hash you can choose to parse it into an OpenStruct by using the object_class option. Then you can use ruby’s method syntax to access the data.

parsed_data = JSON.parse('{"color": "blue"}', object_class: OpenStruct)
puts parsed_data.color # prints 'blue'
