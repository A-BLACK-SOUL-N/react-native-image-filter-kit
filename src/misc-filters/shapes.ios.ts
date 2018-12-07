import {
  scalar,
  color,
  image,
  bool,
  position,
  distance
} from '../common/inputs'
import { Generator } from '../common/shapes'

const Common = {
  inputImage: image,
  disableCache: bool
}

const Gradient = {
  inputAmount: scalar,
  inputColor0: color,
  inputColor1: color,
  inputColor2: color,
  inputColor3: color,
  inputColor4: color,
  inputStop0: scalar,
  inputStop1: scalar,
  inputStop2: scalar,
  inputStop3: scalar,
  inputStop4: scalar,
  ...Generator
}

export const shapes = {
  IFKHazeRemoval: {
    inputDistance: scalar,
    inputSlope: scalar,
    inputColor: color,
    ...Common
  },

  IFKLinearGradient: {
    inputStart: position,
    inputEnd: position,
    ...Gradient
  },

  IFKRadialGradient: {
    inputCenter: position,
    inputRadius: distance,
    ...Gradient
  },

  IFKSweepGradient: {
    inputCenter: position,
    ...Gradient
  }
}
