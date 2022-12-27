# -*- coding: utf-8 -*-
# context manager 작성
import contextlib
import sqlite3
from contextlib import asynccontextmanager
# context 매니저 패턴
# open / close
# Lock / Release
# Change / Reset
# Enter / Exit
# Start / Stop
# Setup / TearDown
# Connect / Disconnect

# 일반적인 형태
###
# 이 함수는 context manager를 사용하겠다 라고 명시
@contextlib.contextmanager 
# 동기화 처리
def db_connect(url):

    db = sqlite3.db_connect(url)
    yield db

    db.close()

#비동기화 처리
@asynccontextmanager
def db_connect(url):

    db = sqlite3.db_connect(url)
    yield db

    db.close()

def main():
    url = None
    db_connect(url)
###