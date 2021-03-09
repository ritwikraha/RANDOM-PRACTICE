from scipy import ndimage
import cv2
from itertools import product

image1 = cv2.imread('angelina.jpg')
final_img = image1.copy()
T1 = 127.0
T2 = 148.0

h,w,c = image1.shape

for i in range(h):
	for j in range(w):
		print(image1[i][j][0])
		
		if (image1[i][j][0] >= T2) and (image1[i][j][0] < 255):
			final_img[i][j][0] = T2
		elif (image1[i][j][0] >= T1) and (image1[i][j][0] < T2):
			final_img[i][j][0] = T1
		elif (image1[i][j][0] >= 0) and (image1[i][j][0] < T1):
			final_img[i][j][0] = 0
			


print(ndimage.variance(final_img))

cv2.imshow('Otsu Threshold', final_img)          
       
# De-allocate any associated memory usage          
if cv2.waitKey(0) & 0xff == 27: 
    cv2.destroyAllWindows() 