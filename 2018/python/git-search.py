# Somtimes we may want to search code on github and find the effected repos or projects and so on, which is a bit hard to find it from the gui.
# cerner_2^5_2018
# python git-search.py
# PrasannaMuppidi/cerner-2-to-the-5th
# SameenaThab/cerner-2-to-the-5th
# amcginn/2tothe5
# chinthanbhat/cerner-2-to-the-5th
# ericsolomon/2to5_2018
# jlobello/cerner_2-5_2018
# kendallberner/twotothefifth
# kishoreggnv/Cerner-2-to-the-5th
# kylescott/cerner_2-5_2018
# mithuns/cerner-2-to-the-5th
# mohanambati/Cerner32DaysCode
# nrayapati/cerner_2to5
# saqiurila/2-to-the-5th
# susmitha-anandarao/Cerner-2-to-the-5th
# vishva007/cerner2to5_2018

import json, requests

headers = {'Accept': "application/vnd.github.loki-preview",
           'authorization': "token 7381777c69e665399c5345e42e27d8ae54eb9c37"}

repos = []
response = requests.get("https://api.github.com/search/code?q=cerner_2^5_2018", headers=headers)
jsonData = json.loads(response.text)
for repo in sorted(jsonData["items"]):
    repos.append(str(repo["repository"]["full_name"]))

# Print in seperate line so that it is easy to follow
for v in sorted(set(repos)):
    print '{0: <15}'.format(v)
