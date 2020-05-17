<template>
  <div id="login">
    <label for="username">用户名:</label><input id="username" type="text" v-model="loginForm.username" placeholder="请输入用户名"/>
    <br/><br/>
    <label for="password">密码：</label><input id="password" type="password" v-model="loginForm.password" placeholder="请输入密码"/>
    <br><br>
    <button v-on:click="login">登录</button>
  </div>
</template>

<script>
  import qs from 'Qs'
export default {
  name: 'Login',
  data () {
    return {
      loginForm: {
        username: '',
        password: ''
      },
      responseResult: []
    }
  },
  methods: {
    login () {

      this.$axios
        .post('/login', {
          username: this.loginForm.username,
          password: this.loginForm.password
        })
        .then(successResponse => {
          if (successResponse.data) {
            this.$router.replace({path: '/index'})
          }
        })
        .catch(failResponse => {
        })
    }
  }
}
</script>

<style scoped>
  #login{
    /*background: url("../../static/download.jpg");*/
    /*!*background-size: cover;*!*/
    /*position: fixed;*/
    /*width: 100%;*/
    /*height: 100%;*/
    /*display: flex;*/
    /*justify-content: center;*/
    /*align-items: center;*/
  }
  /*#username{*/
  /*  !*flex: 1;*!*/
  /*  height: 50px;*/
  /*}*/
  /*#password{*/
  /*  !*flex: 1;*!*/

  /*  height: 50px;*/
  /*}*/
</style>
