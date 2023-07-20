arturttl79@artur-pc:/etc/netplan$ ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
2: enp0s1: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether b2:a3:03:1f:1c:00 brd ff:ff:ff:ff:ff:ff
    inet 192.168.64.2/24 metric 100 brd 192.168.64.255 scope global dynamic enp0s1
       valid_lft 86049sec preferred_lft 86049sec
    inet6 fd37:a312:ab9d:1435:b0a3:3ff:fe1f:1c00/64 scope global dynamic mngtmpaddr noprefixroute 
       valid_lft 2591941sec preferred_lft 604741sec
    inet6 fe80::b0a3:3ff:fe1f:1c00/64 scope link 
       valid_lft forever preferred_lft forever
3: docker0: <NO-CARRIER,BROADCAST,MULTICAST,UP> mtu 1500 qdisc noqueue state DOWN group default 
    link/ether 02:42:44:03:ca:c9 brd ff:ff:ff:ff:ff:ff
    inet 172.17.0.1/16 brd 172.17.255.255 scope global docker0
       valid_lft forever preferred_lft forever
arturttl79@artur-pc:/etc/netplan$ cd
arturttl79@artur-pc:~$ ls /etc/netplan/
00-installer-config.yaml
arturttl79@artur-pc:~$ cat /etc/netplan/*.yaml
# This is the network config written by 'subiquity'
network:
  ethernets:
    enp0s1:
      dhcp4: true
  version: 2
arturttl79@artur-pc:~$ nano /etc/netplan/*.yaml
arturttl79@artur-pc:~$ sudo su
root@artur-pc:/home/arturttl79# ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
2: enp0s1: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether b2:a3:03:1f:1c:00 brd ff:ff:ff:ff:ff:ff
    inet 192.168.64.2/24 metric 100 brd 192.168.64.255 scope global dynamic enp0s1
       valid_lft 85795sec preferred_lft 85795sec
    inet6 fd37:a312:ab9d:1435:b0a3:3ff:fe1f:1c00/64 scope global dynamic mngtmpaddr noprefixroute 
       valid_lft 2591959sec preferred_lft 604759sec
    inet6 fe80::b0a3:3ff:fe1f:1c00/64 scope link 
       valid_lft forever preferred_lft forever
3: docker0: <NO-CARRIER,BROADCAST,MULTICAST,UP> mtu 1500 qdisc noqueue state DOWN group default 
    link/ether 02:42:44:03:ca:c9 brd ff:ff:ff:ff:ff:ff
    inet 172.17.0.1/16 brd 172.17.255.255 scope global docker0
       valid_lft forever preferred_lft forever
root@artur-pc:/home/arturttl79# nano /etc/netplan/*.yaml
root@artur-pc:/home/arturttl79# ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
2: enp0s1: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether b2:a3:03:1f:1c:00 brd ff:ff:ff:ff:ff:ff
    inet 192.168.64.2/24 metric 100 brd 192.168.64.255 scope global dynamic enp0s1
       valid_lft 85542sec preferred_lft 85542sec
    inet6 fd37:a312:ab9d:1435:b0a3:3ff:fe1f:1c00/64 scope global dynamic mngtmpaddr noprefixroute 
       valid_lft 2591972sec preferred_lft 604772sec
    inet6 fe80::b0a3:3ff:fe1f:1c00/64 scope link 
       valid_lft forever preferred_lft forever
3: docker0: <NO-CARRIER,BROADCAST,MULTICAST,UP> mtu 1500 qdisc noqueue state DOWN group default 
    link/ether 02:42:44:03:ca:c9 brd ff:ff:ff:ff:ff:ff
    inet 172.17.0.1/16 brd 172.17.255.255 scope global docker0
       valid_lft forever preferred_lft forever
root@artur-pc:/home/arturttl79# ip addr add 192.168.0.9/255.255.255.0 broadcast 192.168.0.255
Not enough information: "dev" argument is required.
root@artur-pc:/home/arturttl79# ip addr add 192.168.0.9/255.255.255.0 broadcast 192.168.0.255 dev enp0s3
Cannot find device "enp0s3"
root@artur-pc:/home/arturttl79# nano /etc/netplan/*.yaml
root@artur-pc:/home/arturttl79# ip addr add 192.168.0.9/255.255.255.0 broadcast 192.168.0.255 dev enp0s3
Cannot find device "enp0s3"
root@artur-pc:/home/arturttl79# ip addr add 192.168.0.9/255.255.255.0 broadcast 192.168.0.255 dev enp0s1
root@artur-pc:/home/arturttl79# echo $?
0
root@artur-pc:/home/arturttl79# ping ya.ru
PING ya.ru (77.88.55.242) 56(84) bytes of data.
64 bytes from ya.ru (77.88.55.242): icmp_seq=1 ttl=43 time=269 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=2 ttl=43 time=307 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=3 ttl=43 time=350 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=4 ttl=43 time=288 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=5 ttl=43 time=328 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=6 ttl=43 time=267 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=7 ttl=43 time=311 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=8 ttl=43 time=348 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=9 ttl=43 time=285 ms
64 bytes from ya.ru (77.88.55.242): icmp_seq=10 ttl=43 time=326 ms
^C
--- ya.ru ping statistics ---
10 packets transmitted, 10 received, 0% packet loss, time 9028ms
rtt min/avg/max/mdev = 267.061/307.813/349.878/28.649 ms
root@artur-pc:/home/arturttl79# ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
2: enp0s1: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether b2:a3:03:1f:1c:00 brd ff:ff:ff:ff:ff:ff
    inet 192.168.64.2/24 metric 100 brd 192.168.64.255 scope global dynamic enp0s1
       valid_lft 85396sec preferred_lft 85396sec
    inet 192.168.0.9/24 brd 192.168.0.255 scope global enp0s1
       valid_lft forever preferred_lft forever
    inet6 fd37:a312:ab9d:1435:b0a3:3ff:fe1f:1c00/64 scope global dynamic mngtmpaddr noprefixroute 
       valid_lft 2591950sec preferred_lft 604750sec
    inet6 fe80::b0a3:3ff:fe1f:1c00/64 scope link 
       valid_lft forever preferred_lft forever
3: docker0: <NO-CARRIER,BROADCAST,MULTICAST,UP> mtu 1500 qdisc noqueue state DOWN group default 
    link/ether 02:42:44:03:ca:c9 brd ff:ff:ff:ff:ff:ff
    inet 172.17.0.1/16 brd 172.17.255.255 scope global docker0
       valid_lft forever preferred_lft forever
root@artur-pc:/home/arturttl79# iptables show
Bad argument `show'
Try `iptables -h' or 'iptables --help' for more information.
root@artur-pc:/home/arturttl79# iptables 
iptables v1.8.7 (nf_tables): no command specified
Try `iptables -h' or 'iptables --help' for more information.
root@artur-pc:/home/arturttl79# iptables -h
iptables v1.8.7

Usage: iptables -[ACD] chain rule-specification [options]
	iptables -I chain [rulenum] rule-specification [options]
	iptables -R chain rulenum rule-specification [options]
	iptables -D chain rulenum [options]
	iptables -[LS] [chain [rulenum]] [options]
	iptables -[FZ] [chain] [options]
	iptables -[NX] chain
	iptables -E old-chain-name new-chain-name
	iptables -P chain target [options]
	iptables -h (print this help information)

Commands:
Either long or short options are allowed.
  --append  -A chain		Append to chain
  --check   -C chain		Check for the existence of a rule
  --delete  -D chain		Delete matching rule from chain
  --delete  -D chain rulenum
				Delete rule rulenum (1 = first) from chain
  --insert  -I chain [rulenum]
				Insert in chain as rulenum (default 1=first)
  --replace -R chain rulenum
				Replace rule rulenum (1 = first) in chain
  --list    -L [chain [rulenum]]
				List the rules in a chain or all chains
  --list-rules -S [chain [rulenum]]
				Print the rules in a chain or all chains
  --flush   -F [chain]		Delete all rules in  chain or all chains
  --zero    -Z [chain [rulenum]]
				Zero counters in chain or all chains
  --new     -N chain		Create a new user-defined chain
  --delete-chain
	     -X [chain]		Delete a user-defined chain
  --policy  -P chain target
				Change policy on chain to target
  --rename-chain
	     -E old-chain new-chain
				Change chain name, (moving any references)
Options:
    --ipv4	-4		Nothing (line is ignored by ip6tables-restore)
    --ipv6	-6		Error (line is ignored by iptables-restore)
[!] --proto	-p proto	protocol: by number or name, eg. `tcp'
[!] --source	-s address[/mask][...]
				source specification
[!] --destination -d address[/mask][...]
				destination specification
[!] --in-interface -i input name[+]
				network interface name ([+] for wildcard)
 --jump	-j target
				target for rule (may load target extension)
  --goto      -g chain
			       jump to chain with no return
  --match	-m match
				extended match (may load extension)
  --numeric	-n		numeric output of addresses and ports
[!] --out-interface -o output name[+]
				network interface name ([+] for wildcard)
  --table	-t table	table to manipulate (default: `filter')
  --verbose	-v		verbose mode
  --wait	-w [seconds]	maximum wait to acquire xtables lock before give up
  --wait-interval -W [usecs]	wait time to try to acquire xtables lock
				default is 1 second
  --line-numbers		print line numbers when listing
  --exact	-x		expand numbers (display exact values)
[!] --fragment	-f		match second or further fragments only
  --modprobe=<command>		try to insert modules using this command
  --set-counters PKTS BYTES	set the counter during insert/append
[!] --version	-V		print package version.
root@artur-pc:/home/arturttl79# iptables list
Bad argument `list'
Try `iptables -h' or 'iptables --help' for more information.
root@artur-pc:/home/arturttl79# iptables --list
Chain INPUT (policy ACCEPT)
target     prot opt source               destination         

Chain FORWARD (policy DROP)
target     prot opt source               destination         
DOCKER-USER  all  --  anywhere             anywhere            
DOCKER-ISOLATION-STAGE-1  all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere             ctstate RELATED,ESTABLISHED
DOCKER     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination         

Chain DOCKER (1 references)
target     prot opt source               destination         

Chain DOCKER-ISOLATION-STAGE-1 (1 references)
target     prot opt source               destination         
DOCKER-ISOLATION-STAGE-2  all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-ISOLATION-STAGE-2 (1 references)
target     prot opt source               destination         
DROP       all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-USER (1 references)
target     prot opt source               destination         
RETURN     all  --  anywhere             anywhere            
root@artur-pc:/home/arturttl79# iptables -A INPUT -i lo -j ACCEPT
root@artur-pc:/home/arturttl79# echo $?
0
root@artur-pc:/home/arturttl79# iptables --list
Chain INPUT (policy ACCEPT)
target     prot opt source               destination         
ACCEPT     all  --  anywhere             anywhere            

Chain FORWARD (policy DROP)
target     prot opt source               destination         
DOCKER-USER  all  --  anywhere             anywhere            
DOCKER-ISOLATION-STAGE-1  all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere             ctstate RELATED,ESTABLISHED
DOCKER     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination         

Chain DOCKER (1 references)
target     prot opt source               destination         

Chain DOCKER-ISOLATION-STAGE-1 (1 references)
target     prot opt source               destination         
DOCKER-ISOLATION-STAGE-2  all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-ISOLATION-STAGE-2 (1 references)
target     prot opt source               destination         
DROP       all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-USER (1 references)
target     prot opt source               destination         
RETURN     all  --  anywhere             anywhere            
root@artur-pc:/home/arturttl79# iptables -p TCP --dport 22 -j ACCEPT
iptables v1.8.7 (nf_tables): no command specified
Try `iptables -h' or 'iptables --help' for more information.
root@artur-pc:/home/arturttl79# iptables -A INPUT -p TCP --dport 22 -j ACCEPT
root@artur-pc:/home/arturttl79# iptables -A INPUT -p TCP --dport 80 -j ACCEPT
root@artur-pc:/home/arturttl79# iptables -A INPUT -p TCP --dport 443 -j ACCEPT
root@artur-pc:/home/arturttl79# iptables --list
Chain INPUT (policy ACCEPT)
target     prot opt source               destination         
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:ssh
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:http
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:https

Chain FORWARD (policy DROP)
target     prot opt source               destination         
DOCKER-USER  all  --  anywhere             anywhere            
DOCKER-ISOLATION-STAGE-1  all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere             ctstate RELATED,ESTABLISHED
DOCKER     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination         

Chain DOCKER (1 references)
target     prot opt source               destination         

Chain DOCKER-ISOLATION-STAGE-1 (1 references)
target     prot opt source               destination         
DOCKER-ISOLATION-STAGE-2  all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-ISOLATION-STAGE-2 (1 references)
target     prot opt source               destination         
DROP       all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-USER (1 references)
target     prot opt source               destination         
RETURN     all  --  anywhere             anywhere            
root@artur-pc:/home/arturttl79# iptables -A INPUT -m state --state ESTABLISHED,RELATED -j ACCEPT
root@artur-pc:/home/arturttl79# iptables -P INPUT DROP
root@artur-pc:/home/arturttl79# iptables --list
Chain INPUT (policy DROP)
target     prot opt source               destination         
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:ssh
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:http
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:https
ACCEPT     all  --  anywhere             anywhere             state RELATED,ESTABLISHED

Chain FORWARD (policy DROP)
target     prot opt source               destination         
DOCKER-USER  all  --  anywhere             anywhere            
DOCKER-ISOLATION-STAGE-1  all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere             ctstate RELATED,ESTABLISHED
DOCKER     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination         

Chain DOCKER (1 references)
target     prot opt source               destination         

Chain DOCKER-ISOLATION-STAGE-1 (1 references)
target     prot opt source               destination         
DOCKER-ISOLATION-STAGE-2  all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-ISOLATION-STAGE-2 (1 references)
target     prot opt source               destination         
DROP       all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-USER (1 references)
target     prot opt source               destination         
RETURN     all  --  anywhere             anywhere            
root@artur-pc:/home/arturttl79# ping google.com
PING google.com (142.250.200.78) 56(84) bytes of data.
64 bytes from 142.250.200.78 (142.250.200.78): icmp_seq=2 ttl=111 time=192 ms
64 bytes from 142.250.200.78 (142.250.200.78): icmp_seq=3 ttl=111 time=201 ms
64 bytes from 142.250.200.78 (142.250.200.78): icmp_seq=4 ttl=111 time=186 ms
64 bytes from 142.250.200.78 (142.250.200.78): icmp_seq=5 ttl=111 time=189 ms
^C
--- google.com ping statistics ---
5 packets transmitted, 4 received, 20% packet loss, time 4019ms
rtt min/avg/max/mdev = 186.152/192.132/200.871/5.461 ms
root@artur-pc:/home/arturttl79# iptables -I INPUT -s 3.4.5.6 -j DROP
root@artur-pc:/home/arturttl79# iptables --list
Chain INPUT (policy DROP)
target     prot opt source               destination         
DROP       all  --  3.4.5.6              anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:ssh
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:http
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:https
ACCEPT     all  --  anywhere             anywhere             state RELATED,ESTABLISHED

Chain FORWARD (policy DROP)
target     prot opt source               destination         
DOCKER-USER  all  --  anywhere             anywhere            
DOCKER-ISOLATION-STAGE-1  all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere             ctstate RELATED,ESTABLISHED
DOCKER     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination         

Chain DOCKER (1 references)
target     prot opt source               destination         

Chain DOCKER-ISOLATION-STAGE-1 (1 references)
target     prot opt source               destination         
DOCKER-ISOLATION-STAGE-2  all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-ISOLATION-STAGE-2 (1 references)
target     prot opt source               destination         
DROP       all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-USER (1 references)
target     prot opt source               destination         
RETURN     all  --  anywhere             anywhere            
root@artur-pc:/home/arturttl79# iptables -t nat -I PREROUTING -p tcp --dport 8090 -j REDIRECT --to-port 80
root@artur-pc:/home/arturttl79# echo $?
0
root@artur-pc:/home/arturttl79# iptables --list
Chain INPUT (policy DROP)
target     prot opt source               destination         
DROP       all  --  3.4.5.6              anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:ssh
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:http
ACCEPT     tcp  --  anywhere             anywhere             tcp dpt:https
ACCEPT     all  --  anywhere             anywhere             state RELATED,ESTABLISHED

Chain FORWARD (policy DROP)
target     prot opt source               destination         
DOCKER-USER  all  --  anywhere             anywhere            
DOCKER-ISOLATION-STAGE-1  all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere             ctstate RELATED,ESTABLISHED
DOCKER     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            
ACCEPT     all  --  anywhere             anywhere            

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination         

Chain DOCKER (1 references)
target     prot opt source               destination         

Chain DOCKER-ISOLATION-STAGE-1 (1 references)
target     prot opt source               destination         
DOCKER-ISOLATION-STAGE-2  all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-ISOLATION-STAGE-2 (1 references)
target     prot opt source               destination         
DROP       all  --  anywhere             anywhere            
RETURN     all  --  anywhere             anywhere            

Chain DOCKER-USER (1 references)
target     prot opt source               destination         
RETURN     all  --  anywhere             anywhere            
root@artur-pc:/home/arturttl79# iptables -I INPUT -p TCP --dport 22 -j DROP
root@artur-pc:/home/arturttl79# client_loop: send disconnect: Broken pipe