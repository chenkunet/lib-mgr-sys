const state = {
  user: null,
  token: null,
  modelBootedVerified: null,
  menu: null
};
const getters = {
  isAuthenticated: state => !!state.token,
  user: state => state.user,
  token: state => state.token,
  modelBootedVerified: state => state.modelBootedVerified,
  menu: state => state.menu,
};
const actions = {
  setUser({ commit }, data) {
    return new Promise((resolve) => {
      commit('setUser', data);
      resolve();
    });
  },
  setToken({ commit }, data) {
    return new Promise((resolve) => {
      commit('setToken', data);
      resolve();
    });
  },
  logout({ commit }) {
    return new Promise((resolve) => {
      commit('logout');
      resolve();
    });
  },
  setMenu({ commit }, data) {
    return new Promise(resolve => {
      commit('setMenu', data)
      resolve();
    })
  },
  setModelBootedVerified({ commit }) {
    commit('setModelBootedVerified');
  }
};
const mutations = {
  setUser(state, data) {
    state.user = data;
  },
  setToken(state, data) {
    state.token = data;
  },
  logout(state) {
    state.user = null;
    state.token = null;
    state.modelBootedVerified = null;
  },
  setModelBootedVerified(state) {
    state.modelBootedVerified = true;
  },
  setMenu(state, data) {
    state.menu = data
  }
};

export default {
  state,
  getters,
  actions,
  mutations
};