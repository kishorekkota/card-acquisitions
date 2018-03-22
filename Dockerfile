FROM ubuntu

RUN apt-get update && apt-get install -y git

RUN mkdir ~/apps

RUN cd ~/apps


