const path = require('path')
 
module.exports = {
  pluginOptions: {
    'resolve-alias': {
      alias: {
        // just like a normal resolve in Webpack
        components: path.resolve(__dirname, './src/components'),
        img: path.resolve(__dirname, './src/assets')
      }
    }
  }
}