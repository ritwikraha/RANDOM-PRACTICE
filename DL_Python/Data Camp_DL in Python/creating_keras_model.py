# Import necessary modules
import keras
from keras.layers import Dense
from keras.models import Sequential

# Save the number of columns in predictors: n_cols
n_cols = predictors.shape[1]

# Set up the model: model
model = Sequential()


model.add(Dense(50,activation='relu',input_shape=(n_cols,)))

model.add(Dense(32,activation='relu'))

model.add(Dense(1))

