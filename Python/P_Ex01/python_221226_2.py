{
 "cells": [
  {
   "cell_type": "markdown",
   "id": "8f6688b9-c805-4bf2-8d60-7223594d4594",
   "metadata": {},
   "source": [
    "## 문자열 연산자\n",
    "- 덧셈과 곱셈 활용"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 3,
   "id": "89e90d42-6146-4136-890e-b9247c8d3bad",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Hello\n",
      "World\n"
     ]
    }
   ],
   "source": [
    "a = 'Hello'\n",
    "b = \"World\"\n",
    "\n",
    "print(a)\n",
    "print(b)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 8,
   "id": "0b0f423f-13fd-48cb-8055-2a347775ee8f",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "HelloWorld\n",
      "HelloWorldHelloWorldHelloWorld\n"
     ]
    }
   ],
   "source": [
    "c = a + b\n",
    "print(c)\n",
    "print(c * 3)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "b58f699d-b3a8-49a4-8b6c-03f2f8cea121",
   "metadata": {},
   "source": [
    "## 인덱싱(Indexing)\n",
    "- 문자열 범위 지정 및 추출"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 13,
   "id": "7b838a88-cb55-4540-8552-f5943b43b5c9",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "H\n",
      "e\n",
      "l\n",
      "!\n"
     ]
    },
    {
     "ename": "IndexError",
     "evalue": "string index out of range",
     "output_type": "error",
     "traceback": [
      "\u001b[1;31m---------------------------------------------------------------------------\u001b[0m",
      "\u001b[1;31mIndexError\u001b[0m                                Traceback (most recent call last)",
      "Cell \u001b[1;32mIn[13], line 6\u001b[0m\n\u001b[0;32m      4\u001b[0m \u001b[38;5;28mprint\u001b[39m(greeting[\u001b[38;5;241m2\u001b[39m])\n\u001b[0;32m      5\u001b[0m \u001b[38;5;28mprint\u001b[39m(greeting[\u001b[38;5;241m-\u001b[39m\u001b[38;5;241m1\u001b[39m])\n\u001b[1;32m----> 6\u001b[0m \u001b[38;5;28mprint\u001b[39m(\u001b[43mgreeting\u001b[49m\u001b[43m[\u001b[49m\u001b[38;5;241;43m12\u001b[39;49m\u001b[43m]\u001b[49m)\n",
      "\u001b[1;31mIndexError\u001b[0m: string index out of range"
     ]
    }
   ],
   "source": [
    "greeting = \"Hello World!\"\n",
    "print(greeting[0])\n",
    "print(greeting[1])\n",
    "print(greeting[2])\n",
    "print(greeting[-1])\n",
    "print(greeting[12])"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "c0987cf9-712f-498a-b9c4-2dac5d7ff0d7",
   "metadata": {},
   "source": [
    "\n",
    "## 슬라이싱\n",
    "- 주피터 노트북에서 마크다운으로 변환(ESC + m)/ 마크다운에서 코드셀로 변환 단축키 존재(ESC + y)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 24,
   "id": "af123a82-36ed-4f90-838d-8393b8e91fc1",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Hello World!\n",
      "o World!\n",
      "oWrd\n",
      "------------\n",
      "Hello Wo\n",
      "HloW\n",
      "lo Wo\n",
      "------------\n",
      "HloWrd\n"
     ]
    }
   ],
   "source": [
    "greeting = \"Hello World!\"\n",
    "#시작 0, 끝자리 미포함 ex) 8-> 7자리까지 포함, step의 수치만큼 이동하면서 골라냄\n",
    "print(greeting[:])\n",
    "print(greeting[4:])\n",
    "print(greeting[4::2])\n",
    "print(\"------------\")\n",
    "print(greeting[:8])\n",
    "print(greeting[:8:2])\n",
    "print(greeting[3:8])\n",
    "print(\"------------\")\n",
    "print(greeting[::2]) #'H' e 'l' l 'o'  'W' O 'r' l 'd' !"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "bef70f84-5714-4fa0-a7bc-5c5dd3544154",
   "metadata": {},
   "source": [
    "## 리스트\n",
    "- 가장 기본적인 배열 자료형 / ArrayList\n",
    "- 시퀀스 데이터 : 데이터에 순서가 존재함"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 26,
   "id": "2cb22dd1-98ad-40ba-a85a-55afcd6dc444",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[]\n",
      "<class 'list'>\n",
      "[]\n",
      "<class 'list'>\n"
     ]
    }
   ],
   "source": [
    "a = [] # 값이 비어있는 리스트\n",
    "a_list_func = list()\n",
    "\n",
    "print(a)\n",
    "print(type(a))\n",
    "\n",
    "print(a_list_func)\n",
    "print(type(a_list_func))"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "0425c31d-95dc-4846-b3a8-53da99958d2e",
   "metadata": {},
   "source": [
    "- 값을 추가한다."
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 32,
   "id": "54ba626f-c359-4d2a-b29b-6135cd297c5c",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[1, 2, 3, 4, 5, 6, 7, 8, ['apple', 'banana', 'carrot'], 'humanEdu']\n",
      "1\n",
      "[1, 3, 5, 7]\n"
     ]
    }
   ],
   "source": [
    "a = [1, 2, 3, 4, 5, 6, 7, 8, [\"apple\",\"banana\",\"carrot\"], \"humanEdu\"]\n",
    "print(a)\n",
    "print(a[0])\n",
    "print(a[0:7:2])"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "0569096b-fd65-4b99-9e2a-ce6027c3c688",
   "metadata": {},
   "source": [
    "- a 리스트 안에 있는 banana 문자열에서 맨 마지막 글자 a를 추출한다.\n",
    "- 중첩리스트 : 리스트 안에 또 다른 리스트가 존재함"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 46,
   "id": "a00c173b-3639-4fab-afd8-564759a21ed0",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "['apple', 'banana', 'carrot']\n",
      "banana\n",
      "a\n",
      "a\n",
      "a\n",
      "o\n",
      "E\n"
     ]
    }
   ],
   "source": [
    "b = a[8]\n",
    "print(b)\n",
    "c = b[1]\n",
    "print(c)\n",
    "d = c[-1]\n",
    "print(d)\n",
    "print(a[8][1][5])\n",
    "print(a[8][1][-1])\n",
    "print(a[8][2][-2])\n",
    "print(a[9][-3])"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "786b36f8-bc33-49db-816d-662d0d237cae",
   "metadata": {},
   "source": [
    "## 리스트 연산자\n",
    "- 덧셈, 곱셈 적용 후 결과 확인"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 49,
   "id": "a3c65e1c-4918-4699-a0ab-68e77f353e37",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[1, 2, 3, 4, 5, 6, 7]\n"
     ]
    }
   ],
   "source": [
    "a = [1, 2, 3]\n",
    "b = [4, 5, 6, 7]\n",
    "print(a + b)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 51,
   "id": "2d74d3e5-3a7b-4363-833d-650cfe5ea667",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[1, 2, 3, 1, 2, 3, 1, 2, 3]\n"
     ]
    }
   ],
   "source": [
    "a = [1, 2, 3]\n",
    "print(a * 3)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "b47f5359-9fe7-4b1d-bece-ccc2cc573932",
   "metadata": {},
   "source": [
    "## 리스트 값 수정하기\n",
    "- 리스트 내 원소의 값을 수정"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 55,
   "id": "9fe7947b-0bb0-4081-9260-cd22ceeb35b7",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "['a', 'a', 'a', 'a']\n"
     ]
    }
   ],
   "source": [
    "a = ['a', 'b', 'a', 'a']\n",
    "a[1] ='a'\n",
    "print(a)"
   ]
  },
  {
   "cell_type": "markdown",
   "id": "3056eceb-3067-4561-a871-5d957c2e7409",
   "metadata": {},
   "source": [
    "## 리스트 클래스 내부의 여러 함수\n",
    "- 참조 : https://docs.python.org/3/tutorial/datastructures.html"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.11.1"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
