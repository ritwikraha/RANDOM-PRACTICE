#!/usr/bin/env python
# coding: utf-8

# In[3]:


import matplotlib.pyplot as plt


# In[5]:


data= plt.imread('E:/study/TUTORIALS/RANDOM-PRACTICE/DL_Python/CNN/stop_sign.jpg')
data1=data

# In[6]:


data[:, :, 1]=data1
data[:, :, 2]=data1
plt.imshow(data1)
plt.show()


