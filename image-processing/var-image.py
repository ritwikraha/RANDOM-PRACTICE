import cv2

def winVar(img, wlen):
  wmean, wsqrmean = (cv2.boxFilter(x, -1, (wlen, wlen),
    borderType=cv2.BORDER_REFLECT) for x in (img, img*img))
  return wsqrmean - wmean*wmean
  
image1 = cv2.imread('angelina.jpg') 
print(winVar(image1,3))