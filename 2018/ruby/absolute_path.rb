# Pass a string to File.expand_path to generate the path to that file or directory. Relative paths will reference your current working directory, and paths prepended with ~ will use the owner’s home directory.

# cerner_2^5_2018

File.expand_path('example.rb')
=> "/Users/nr031563/Naresh/cerner_2to5/ruby/example.rb"

File.expand_path('~/example.rb')
=> "/Users/nr031563/example.rb"