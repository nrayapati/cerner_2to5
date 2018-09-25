# cerner_2^5_2018
# https://ohmyz.sh/ is one of my favorites
# Uppercase lowercase variable in zsh

# If you want to, for example, rename lowercase a list of files, you can use the handy zsh shortcuts :l and :u:
for file in *.jpg; do mv $file $file:l; done
# uppper case is similar:
for file in *.jpg; do mv $file $file:u; done