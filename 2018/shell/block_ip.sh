# cerner_2^5_2018
# Useful while testing when the test case is negative one to test if the perticular server is down or url is not accessable.
# And also instead of using the adblockers, which are now a days stealing our info, could just update the config to avoid hits to publich servers
# Have tested this on Mac.
# Flush the dns cache
sudo killall -HUP mDNSResponder;say DNS cache has been flushed

# Add entry to hosts to hit localhost instead.
Sudo vi /etc/hosts
127.0.0.1   your address
