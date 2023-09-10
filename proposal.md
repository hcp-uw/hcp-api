# Hosting Services

## Traffic Capacity Planning

We need a cloud provider that will be able to handle peak loads of up to ~`40` concurrent users making ~`3` requests/sec, or in other words, ~`120` requests/sec.

As a rough estimation, lets say each request payload is ~`100 bytes`, and each response payload is ~`500 bytes` (very rough). This estimation doesn't take into account file uploads like pictures and PDFs (for resume upload), which can be done async.

With minimal HTTP headers and metadata, this would give the following:

- Average request: `400 bytes`
- Average response: `750 bytes`

- Total ingress: `400 bytes * 120 requests/sec = 48 kb/sec`
- Total egress: `750 bytes * 120 requests/sec = 90 kb/sec`

- Total: `1150 bytes * 120 requests/sec = 138 kb/sec` during peak usage

```
ingress: 48 kb/sec
egress: 90 kb/sec
total: 138 kb/sec
```

Assuming an avergage load on our servers of ~`10%` our peak usage (accounting for locality of members and tendancy for people to visit the site only during meetings), we have an average load on our servers of...

```
ingress: 5 kb/sec
egress: 9 kb/sec
total: 14 kb/sec
```

Which gives us a monthly utilization of...

``` 
ingress: 13 gb/month
egress: 23.3 gb/month
total: 26 gb/month
```

## Storage Capacity Planning

Our main storage bottleneck will be persiting file uploads for member's pictures and resume.

Assuming the average resume upload is `.7 mb` (double the size of my resume), and the average photo upload is `3 mb`, allowing for 100 members to upload their files would require ~`370 mb` of storage. Rounding up for user/project/team data, we need ~`400 mb` of storage space.

```
400 mb
```


## Providers

### Google Cloud Platform

GCP's always free tier with an e2-micro allows for up to 1 gb network egress each month. Since we are exceeding this figure by quite a bit, without using the always free tier we would be paying...

```
e2-micro: $6.11/month
ephemeral public IP: $2.92/month
10 gb (minimum) persistant disk: $1.00/month

total: $10.03/month
```

GCP also offers a `9-month $300` free-trial period, but this would be very temporary.

### Azure 

Azure does not offer an always-free tier

```
A0, 1 Core, 0.75 GB RAM: $13.14/month
< 100 gb network egress: FREE
4 GiB (minimum) persistent disk: $0.30/month

total: $13.44/month
```

Azure offers a `12-month` free trial for their VMs.

### AWS

```
t4g.nano, 2vCPU, 0.5 GiB Memory: $3.07/month
25 gb network egress: $2.25/month
EBS, 1 gb, 100 mb/s : $0.08/month

total: $5.40/month
```


