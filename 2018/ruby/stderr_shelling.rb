# cerner_2^5_2018

# All of the usual methods of shelling out in ruby (backticks, system, etc.) don’t capture stderr, but there’s an oddly named library open3 that can help with that.

require 'open3'

result_or_err, process_status = Open3.capture2e('cat abc')
puts result_or_err
# 'cat: abc: No such file or directory'
puts process_status
# <Process::Status: pid 6729 exit 1>]

# In this case cat abc errors out because there is no abc file, so the command writes to stderr. If there was an abc file, result_or_err would contain the contents of the abc file.

# source: https://blog.honeybadger.io/capturing-stdout-stderr-from-shell-commands-via-ruby/