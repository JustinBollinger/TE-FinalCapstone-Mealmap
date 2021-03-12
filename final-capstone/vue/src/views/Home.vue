<template>

  <div id="home-contain">
    <h1>Welcome to Your Meal Planner</h1>
    <div id="home-left-right-container">
      <div id="header-text" class="home-left">
        <ul>
          <li>1. Do some stuff in your stuff</li>
          <li>2. also you can can in your can</li>
          <li>3. make some making to make make</li>
          <li>4. store all your store in your store</li>
          <li>5. data is data that you can data with data</li>
        </ul>
      </div>
      <div id="home-image" class="home-right">
        <img src="../assets/Artboard 5.png" alt="full bag of groceries">
      </div>
    </div>

  </div>
</template>

<script>


export default {
  name: "home"
};
</script>


<style>

#home-contain {
  background-image: url("../../public/rainbow-produce-copy.png"), linear-gradient(rgba(0, 0, 255, 0.75), rgba(255, 255, 0, 0.75));
  background-repeat: no-repeat;
  display: flex;
  justify-content: center;
  flex-direction: column;
  padding: 75px 100px 50px 100px;
  border-bottom: rgba(77, 77, 77, 100) solid 5px;
}

#home-left-right-container{
  display: flex;
  flex-direction: row;
}

h1 {
  font-family: Roboto, sans-serif;
  color: white;
  font-size: 4rem;
}

#header-text {
  display: flex;
  justify-content: left;
  max-width: ;
}

img{
  max-width: 300px;
}

#home-image {
  display: flex;
  justify-content: right;
}



</style>
