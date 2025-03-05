FROM ubuntu:latest
LABEL authors="oiiva"

ENTRYPOINT ["top", "-b"]