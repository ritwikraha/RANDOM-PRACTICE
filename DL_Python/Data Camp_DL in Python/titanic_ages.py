In [1]: df.describe()
Out[1]: 
         survived            ...              embarked_from_southampton
count  891.000000            ...                             891.000000
mean     0.383838            ...                               0.722783
std      0.486592            ...                               0.447876
min      0.000000            ...                               0.000000
25%      0.000000            ...                               0.000000
50%      0.000000            ...                               1.000000
75%      1.000000            ...                               1.000000
max      1.000000            ...                               1.000000

[8 rows x 10 columns]

In [2]: df.head()
Out[2]: 
   survived            ...              embarked_from_southampton
0         0            ...                                      1
1         1            ...                                      0
2         1            ...                                      1
3         1            ...                                      1
4         0            ...                                      1

[5 rows x 11 columns]

In [3]: age.describe()
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
    age.describe()
NameError: name 'age' is not defined

In [4]: df.describe(age)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
    df.describe(age)
NameError: name 'age' is not defined

In [5]: df.age.describe()
Out[5]: 
count    891.000000
mean      29.699118
std       13.002015
min        0.420000
25%       22.000000
50%       29.699118
75%       35.000000
max       80.000000
Name: age, dtype: float64