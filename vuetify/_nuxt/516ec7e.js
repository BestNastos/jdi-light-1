(window.webpackJsonp=window.webpackJsonp||[]).push([[76],{366:function(t,e,r){"use strict";r.d(e,"a",(function(){return c})),r.d(e,"b",(function(){return l})),r.d(e,"c",(function(){return v})),r.d(e,"d",(function(){return d}));var n=r(389),o=r(2),c=Object(o.j)("v-card__actions"),l=Object(o.j)("v-card__subtitle"),v=Object(o.j)("v-card__text"),d=Object(o.j)("v-card__title");n.a},368:function(t,e,r){"use strict";var n=r(136);e.a=n.a},389:function(t,e,r){"use strict";r(13),r(6),r(12),r(15),r(9),r(16);var n=r(3),o=(r(37),r(250),r(394),r(368)),c=r(411),l=r(105),v=r(10);function d(object,t){var e=Object.keys(object);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(object);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(object,t).enumerable}))),e.push.apply(e,r)}return e}function h(t){for(var i=1;i<arguments.length;i++){var source=null!=arguments[i]?arguments[i]:{};i%2?d(Object(source),!0).forEach((function(e){Object(n.a)(t,e,source[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(source)):d(Object(source)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(source,e))}))}return t}e.a=Object(v.a)(c.a,l.a,o.a).extend({name:"v-card",props:{flat:Boolean,hover:Boolean,img:String,link:Boolean,loaderHeight:{type:[Number,String],default:4},raised:Boolean},computed:{classes:function(){return h(h({"v-card":!0},l.a.options.computed.classes.call(this)),{},{"v-card--flat":this.flat,"v-card--hover":this.hover,"v-card--link":this.isClickable,"v-card--loading":this.loading,"v-card--disabled":this.disabled,"v-card--raised":this.raised},o.a.options.computed.classes.call(this))},styles:function(){var style=h({},o.a.options.computed.styles.call(this));return this.img&&(style.background='url("'.concat(this.img,'") center center / cover no-repeat')),style}},methods:{genProgress:function(){var t=c.a.options.methods.genProgress.call(this);return t?this.$createElement("div",{staticClass:"v-card__progress",key:"progress"},[t]):null}},render:function(t){var e=this.generateRouteLink(),r=e.tag,data=e.data;return data.style=this.styles,this.isClickable&&(data.attrs=data.attrs||{},data.attrs.tabindex=0),t(r,this.setBackgroundColor(this.color,data),[this.genProgress(),this.$slots.default])}})},391:function(t,e,r){"use strict";r(37),r(36),r(404);var n=r(183),o=r(30),c=r(2);e.a=o.a.extend({name:"v-progress-circular",directives:{intersect:n.a},props:{button:Boolean,indeterminate:Boolean,rotate:{type:[Number,String],default:0},size:{type:[Number,String],default:32},width:{type:[Number,String],default:4},value:{type:[Number,String],default:0}},data:function(){return{radius:20,isVisible:!0}},computed:{calculatedSize:function(){return Number(this.size)+(this.button?8:0)},circumference:function(){return 2*Math.PI*this.radius},classes:function(){return{"v-progress-circular--visible":this.isVisible,"v-progress-circular--indeterminate":this.indeterminate,"v-progress-circular--button":this.button}},normalizedValue:function(){return this.value<0?0:this.value>100?100:parseFloat(this.value)},strokeDashArray:function(){return Math.round(1e3*this.circumference)/1e3},strokeDashOffset:function(){return(100-this.normalizedValue)/100*this.circumference+"px"},strokeWidth:function(){return Number(this.width)/+this.size*this.viewBoxSize*2},styles:function(){return{height:Object(c.h)(this.calculatedSize),width:Object(c.h)(this.calculatedSize)}},svgStyles:function(){return{transform:"rotate(".concat(Number(this.rotate),"deg)")}},viewBoxSize:function(){return this.radius/(1-Number(this.width)/+this.size)}},methods:{genCircle:function(t,e){return this.$createElement("circle",{class:"v-progress-circular__".concat(t),attrs:{fill:"transparent",cx:2*this.viewBoxSize,cy:2*this.viewBoxSize,r:this.radius,"stroke-width":this.strokeWidth,"stroke-dasharray":this.strokeDashArray,"stroke-dashoffset":e}})},genSvg:function(){var t=[this.indeterminate||this.genCircle("underlay",0),this.genCircle("overlay",this.strokeDashOffset)];return this.$createElement("svg",{style:this.svgStyles,attrs:{xmlns:"http://www.w3.org/2000/svg",viewBox:"".concat(this.viewBoxSize," ").concat(this.viewBoxSize," ").concat(2*this.viewBoxSize," ").concat(2*this.viewBoxSize)}},t)},genInfo:function(){return this.$createElement("div",{staticClass:"v-progress-circular__info"},this.$slots.default)},onObserve:function(t,e,r){this.isVisible=r}},render:function(t){return t("div",this.setTextColor(this.color,{staticClass:"v-progress-circular",attrs:{role:"progressbar","aria-valuemin":0,"aria-valuemax":100,"aria-valuenow":this.indeterminate?void 0:this.normalizedValue},class:this.classes,directives:[{name:"intersect",value:this.onObserve}],style:this.styles,on:this.$listeners}),[this.genSvg(),this.genInfo()])}})},394:function(t,e,r){var content=r(398);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[t.i,content,""]]),content.locals&&(t.exports=content.locals);(0,r(21).default)("e23b7040",content,!0,{sourceMap:!1})},398:function(t,e,r){var n=r(20)(!1);n.push([t.i,'.theme--light.v-card{background-color:#fff;color:rgba(0,0,0,.87)}.theme--light.v-card>.v-card__subtitle,.theme--light.v-card>.v-card__text{color:rgba(0,0,0,.6)}.theme--dark.v-card{background-color:#1e1e1e;color:#fff}.theme--dark.v-card>.v-card__subtitle,.theme--dark.v-card>.v-card__text{color:hsla(0,0%,100%,.7)}.v-sheet.v-card{border-radius:4px}.v-sheet.v-card:not(.v-sheet--outlined){box-shadow:0 3px 1px -2px rgba(0,0,0,.2),0 2px 2px 0 rgba(0,0,0,.14),0 1px 5px 0 rgba(0,0,0,.12)}.v-sheet.v-card.v-sheet--shaped{border-radius:24px 4px}.v-card{border-width:thin;display:block;max-width:100%;outline:none;text-decoration:none;transition-property:box-shadow,opacity;word-wrap:break-word;position:relative;white-space:normal}.v-card>.v-card__progress+:not(.v-btn):not(.v-chip):not(.v-avatar),.v-card>:first-child:not(.v-btn):not(.v-chip):not(.v-avatar){border-top-left-radius:inherit;border-top-right-radius:inherit}.v-card>:last-child:not(.v-btn):not(.v-chip):not(.v-avatar){border-bottom-left-radius:inherit;border-bottom-right-radius:inherit}.v-card__progress{top:0;left:0;right:0;overflow:hidden}.v-card__subtitle+.v-card__text{padding-top:0}.v-card__subtitle,.v-card__text{font-size:.875rem;font-weight:400;line-height:1.375rem;letter-spacing:.0071428571em}.v-card__subtitle,.v-card__text,.v-card__title{padding:16px}.v-card__title{align-items:center;display:flex;flex-wrap:wrap;font-size:1.25rem;font-weight:500;letter-spacing:.0125em;line-height:2rem;word-break:break-all}.v-card__title+.v-card__subtitle,.v-card__title+.v-card__text{padding-top:0}.v-card__title+.v-card__subtitle{margin-top:-16px}.v-card__text{width:100%}.v-card__actions{align-items:center;display:flex;padding:8px}.v-card__actions>.v-btn.v-btn{padding:0 8px}.v-application--is-ltr .v-card__actions>.v-btn.v-btn+.v-btn{margin-left:8px}.v-application--is-ltr .v-card__actions>.v-btn.v-btn .v-icon--left{margin-left:4px}.v-application--is-ltr .v-card__actions>.v-btn.v-btn .v-icon--right{margin-right:4px}.v-application--is-rtl .v-card__actions>.v-btn.v-btn+.v-btn{margin-right:8px}.v-application--is-rtl .v-card__actions>.v-btn.v-btn .v-icon--left{margin-right:4px}.v-application--is-rtl .v-card__actions>.v-btn.v-btn .v-icon--right{margin-left:4px}.v-card--flat{box-shadow:0 0 0 0 rgba(0,0,0,.2),0 0 0 0 rgba(0,0,0,.14),0 0 0 0 rgba(0,0,0,.12)!important}.v-sheet.v-card--hover{cursor:pointer;transition:box-shadow .4s cubic-bezier(.25,.8,.25,1)}.v-sheet.v-card--hover:focus,.v-sheet.v-card--hover:hover{box-shadow:0 5px 5px -3px rgba(0,0,0,.2),0 8px 10px 1px rgba(0,0,0,.14),0 3px 14px 2px rgba(0,0,0,.12)}.v-card--link,.v-card--link .v-chip{cursor:pointer}.v-card--link:focus:before{opacity:.08}.v-card--link:before{background:currentColor;bottom:0;content:"";left:0;opacity:0;pointer-events:none;position:absolute;right:0;top:0;transition:opacity .2s}.v-card--disabled{pointer-events:none;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.v-card--disabled>:not(.v-card__progress){opacity:.6;transition:inherit}.v-card--loading{overflow:hidden}.v-card--raised{box-shadow:0 5px 5px -3px rgba(0,0,0,.2),0 8px 10px 1px rgba(0,0,0,.14),0 3px 14px 2px rgba(0,0,0,.12)}',""]),t.exports=n},404:function(t,e,r){var content=r(405);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[t.i,content,""]]),content.locals&&(t.exports=content.locals);(0,r(21).default)("e003f1f8",content,!0,{sourceMap:!1})},405:function(t,e,r){var n=r(20)(!1);n.push([t.i,".v-progress-circular{position:relative;display:inline-flex;vertical-align:middle;justify-content:center;align-items:center}.v-progress-circular>svg{width:100%;height:100%;margin:auto;position:absolute;top:0;bottom:0;left:0;right:0;z-index:0}.v-progress-circular--indeterminate>svg{-webkit-animation:progress-circular-rotate 1.4s linear infinite;animation:progress-circular-rotate 1.4s linear infinite;transform-origin:center center;transition:all .2s ease-in-out}.v-progress-circular--indeterminate .v-progress-circular__overlay{-webkit-animation:progress-circular-dash 1.4s ease-in-out infinite;animation:progress-circular-dash 1.4s ease-in-out infinite;stroke-linecap:round;stroke-dasharray:80,200;stroke-dashoffset:0px}.v-progress-circular--indeterminate:not(.v-progress-circular--visible) .v-progress-circular__overlay,.v-progress-circular--indeterminate:not(.v-progress-circular--visible)>svg{-webkit-animation-play-state:paused!important;animation-play-state:paused!important}.v-progress-circular__info{align-items:center;display:flex;justify-content:center}.v-progress-circular__underlay{stroke:hsla(0,0%,62%,.4);z-index:1}.v-progress-circular__overlay{stroke:currentColor;z-index:2;transition:all .6s ease-in-out}@-webkit-keyframes progress-circular-dash{0%{stroke-dasharray:1,200;stroke-dashoffset:0px}50%{stroke-dasharray:100,200;stroke-dashoffset:-15px}to{stroke-dasharray:100,200;stroke-dashoffset:-124px}}@keyframes progress-circular-dash{0%{stroke-dasharray:1,200;stroke-dashoffset:0px}50%{stroke-dasharray:100,200;stroke-dashoffset:-15px}to{stroke-dasharray:100,200;stroke-dashoffset:-124px}}@-webkit-keyframes progress-circular-rotate{to{transform:rotate(1turn)}}@keyframes progress-circular-rotate{to{transform:rotate(1turn)}}",""]),t.exports=n},421:function(t,e,r){"use strict";r(6),r(12),r(15),r(16);var n=r(3),o=(r(48),r(55),r(36),r(13),r(31),r(58),r(370),r(17),r(45),r(371),r(372),r(373),r(374),r(375),r(376),r(377),r(378),r(379),r(380),r(381),r(382),r(383),r(51),r(9),r(420),r(1)),c=r(90),l=r(2);function v(object,t){var e=Object.keys(object);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(object);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(object,t).enumerable}))),e.push.apply(e,r)}return e}function d(t){for(var i=1;i<arguments.length;i++){var source=null!=arguments[i]?arguments[i]:{};i%2?v(Object(source),!0).forEach((function(e){Object(n.a)(t,e,source[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(source)):v(Object(source)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(source,e))}))}return t}var h=["sm","md","lg","xl"],f=["start","end","center"];function w(t,e){return h.reduce((function(r,n){return r[t+Object(l.I)(n)]=e(),r}),{})}var x=function(t){return[].concat(f,["baseline","stretch"]).includes(t)},_=w("align",(function(){return{type:String,default:null,validator:x}})),m=function(t){return[].concat(f,["space-between","space-around"]).includes(t)},y=w("justify",(function(){return{type:String,default:null,validator:m}})),k=function(t){return[].concat(f,["space-between","space-around","stretch"]).includes(t)},S=w("alignContent",(function(){return{type:String,default:null,validator:k}})),O={align:Object.keys(_),justify:Object.keys(y),alignContent:Object.keys(S)},j={align:"align",justify:"justify",alignContent:"align-content"};function C(t,e,r){var n=j[t];if(null!=r){if(e){var o=e.replace(t,"");n+="-".concat(o)}return(n+="-".concat(r)).toLowerCase()}}var V=new Map;e.a=o.a.extend({name:"v-row",functional:!0,props:d(d(d({tag:{type:String,default:"div"},dense:Boolean,noGutters:Boolean,align:{type:String,default:null,validator:x}},_),{},{justify:{type:String,default:null,validator:m}},y),{},{alignContent:{type:String,default:null,validator:k}},S),render:function(t,e){var r=e.props,data=e.data,o=e.children,l="";for(var v in r)l+=String(r[v]);var d=V.get(l);return d||function(){var t,e;for(e in d=[],O)O[e].forEach((function(t){var n=r[t],o=C(e,t,n);o&&d.push(o)}));d.push((t={"no-gutters":r.noGutters,"row--dense":r.dense},Object(n.a)(t,"align-".concat(r.align),r.align),Object(n.a)(t,"justify-".concat(r.justify),r.justify),Object(n.a)(t,"align-content-".concat(r.alignContent),r.alignContent),t)),V.set(l,d)}(),t(r.tag,Object(c.a)(data,{staticClass:"row",class:d}),o)}})},999:function(t,e,r){"use strict";r.r(e);var n={data:function(){return{ex11:["red","indigo","orange","primary","secondary","success","info","warning","error","red darken-3","indigo darken-3","orange darken-3"]}}},o=r(75),c=r(173),l=r.n(c),v=r(389),d=r(366),h=r(962),f=r(1049),w=r(421),x=r(562),component=Object(o.a)(n,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-card",{attrs:{flat:""}},[r("v-card-text",[r("v-container",{attrs:{fluid:""}},[r("v-row",[r("v-col",{attrs:{cols:"12",sm:"4",md:"4"}},[r("v-switch",{attrs:{label:"red",color:"red",value:"red","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}}),t._v(" "),r("v-switch",{attrs:{label:"red darken-3",color:"red darken-3",value:"red darken-3","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}})],1),t._v(" "),r("v-col",{attrs:{cols:"12",sm:"4",md:"4"}},[r("v-switch",{attrs:{label:"indigo",color:"indigo",value:"indigo","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}}),t._v(" "),r("v-switch",{attrs:{label:"indigo darken-3",color:"indigo darken-3",value:"indigo darken-3","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}})],1),t._v(" "),r("v-col",{attrs:{cols:"12",sm:"4",md:"4"}},[r("v-switch",{attrs:{label:"orange",color:"orange",value:"orange","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}}),t._v(" "),r("v-switch",{attrs:{label:"orange darken-3",color:"orange darken-3",value:"orange darken-3","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}})],1)],1),t._v(" "),r("v-row",{staticClass:"mt-12"},[r("v-col",{attrs:{cols:"12",sm:"4",md:"4"}},[r("v-switch",{attrs:{label:"primary",color:"primary",value:"primary","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}}),t._v(" "),r("v-switch",{attrs:{label:"secondary",color:"secondary",value:"secondary","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}})],1),t._v(" "),r("v-col",{attrs:{cols:"12",sm:"4",md:"4"}},[r("v-switch",{attrs:{label:"success",color:"success",value:"success","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}}),t._v(" "),r("v-switch",{attrs:{label:"info",color:"info",value:"info","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}})],1),t._v(" "),r("v-col",{attrs:{cols:"12",sm:"4",md:"4"}},[r("v-switch",{attrs:{label:"warning",color:"warning",value:"warning","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}}),t._v(" "),r("v-switch",{attrs:{label:"error",color:"error",value:"error","hide-details":""},model:{value:t.ex11,callback:function(e){t.ex11=e},expression:"ex11"}})],1)],1)],1)],1)],1)}),[],!1,null,null,null),_=component.exports;l()(component,{VCard:v.a,VCardText:d.c,VCol:h.a,VContainer:f.a,VRow:w.a,VSwitch:x.a});var m={data:function(){return{switch1:!0,switch2:!1}}},y=r(136),k=Object(o.a)(m,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-sheet",{staticClass:"pa-12",attrs:{width:"100%",height:"100%"}},[r("v-switch",{attrs:{flat:"",label:"Switch 1: "+t.switch1.toString()},model:{value:t.switch1,callback:function(e){t.switch1=e},expression:"switch1"}}),t._v(" "),r("v-switch",{attrs:{flat:"",label:"Switch 2: "+t.switch2.toString()},model:{value:t.switch2,callback:function(e){t.switch2=e},expression:"switch2"}})],1)}),[],!1,null,null,null),S=k.exports;l()(k,{VSheet:y.a,VSwitch:x.a});var O={data:function(){return{switch1:!0,switch2:!1}}},j=Object(o.a)(O,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-sheet",{staticClass:"pa-5"},[r("v-switch",{attrs:{inset:"",label:"Switch 1: "+t.switch1.toString()},model:{value:t.switch1,callback:function(e){t.switch1=e},expression:"switch1"}}),t._v(" "),r("v-switch",{attrs:{inset:"",label:"Switch 2: "+t.switch2.toString()},model:{value:t.switch2,callback:function(e){t.switch2=e},expression:"switch2"}})],1)}),[],!1,null,null,null),C=j.exports;l()(j,{VSheet:y.a,VSwitch:x.a});var V={data:function(){return{people:["John"]}}},z=Object(o.a)(V,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-container",{attrs:{fluid:""}},[r("p",[t._v(t._s(t.people))]),t._v(" "),r("v-switch",{attrs:{color:"primary",label:"John",value:"John"},model:{value:t.people,callback:function(e){t.people=e},expression:"people"}}),t._v(" "),r("v-switch",{attrs:{color:"primary",label:"Jacob",value:"Jacob"},model:{value:t.people,callback:function(e){t.people=e},expression:"people"}})],1)}),[],!1,null,null,null),B=z.exports;l()(z,{VContainer:f.a,VSwitch:x.a});var P={data:function(){return{switch1:!0,switch2:!1}}},M=Object(o.a)(P,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-container",{attrs:{fluid:""}},[r("v-switch",{attrs:{label:"Switch 1: "+t.switch1.toString()},model:{value:t.switch1,callback:function(e){t.switch1=e},expression:"switch1"}}),t._v(" "),r("v-switch",{attrs:{label:"Switch 2: "+t.switch2.toString()},model:{value:t.switch2,callback:function(e){t.switch2=e},expression:"switch2"}})],1)}),[],!1,null,null,null),E=M.exports;l()(M,{VContainer:f.a,VSwitch:x.a});var $=Object(o.a)({},(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-container",{attrs:{fluid:""}},[r("v-row",{staticClass:"dark--text"},[r("v-col",{attrs:{cols:"6"}},[t._v("\n      on\n    ")]),t._v(" "),r("v-col",{attrs:{cols:"6"}},[t._v("\n      off\n    ")])],1),t._v(" "),r("v-row",[r("v-col",{attrs:{cols:"6"}},[r("v-switch",{attrs:{color:"primary",value:"","input-value":"true"}})],1),t._v(" "),r("v-col",{attrs:{cols:"6"}},[r("v-switch",{attrs:{color:"primary"}})],1)],1),t._v(" "),r("v-row",{staticClass:"dark--text"},[r("v-col",{attrs:{cols:"6"}},[t._v("\n      on disabled\n    ")]),t._v(" "),r("v-col",{attrs:{cols:"6"}},[t._v("\n      off disabled\n    ")])],1),t._v(" "),r("v-row",[r("v-col",{attrs:{cols:"6"}},[r("v-switch",{attrs:{color:"primary",value:"","input-value":"true",disabled:""}})],1),t._v(" "),r("v-col",{attrs:{cols:"6"}},[r("v-switch",{attrs:{disabled:""}})],1)],1),t._v(" "),r("v-row",{staticClass:"dark--text"},[r("v-col",{attrs:{cols:"6"}},[t._v("\n      on loading\n    ")]),t._v(" "),r("v-col",{attrs:{cols:"6"}},[t._v("\n      off loading\n    ")])],1),t._v(" "),r("v-row",[r("v-col",{attrs:{cols:"6"}},[r("v-switch",{attrs:{loading:"warning",value:"","input-value":"true"}})],1),t._v(" "),r("v-col",{attrs:{cols:"6"}},[r("v-switch",{attrs:{loading:"warning"}})],1)],1)],1)}),[],!1,null,null,null),D=$.exports;l()($,{VCol:h.a,VContainer:f.a,VRow:w.a,VSwitch:x.a});var A={data:function(){return{switchMe:!1}}},N=r(391),I=Object(o.a)(A,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-container",{attrs:{fluid:""}},[r("v-switch",{scopedSlots:t._u([{key:"label",fn:function(){return[t._v("\n      Turn on the progress: "),r("v-progress-circular",{staticClass:"ml-2",attrs:{indeterminate:t.switchMe,value:0,size:"24"}})]},proxy:!0}]),model:{value:t.switchMe,callback:function(e){t.switchMe=e},expression:"switchMe"}})],1)}),[],!1,null,null,null),J=I.exports;l()(I,{VContainer:f.a,VProgressCircular:N.a,VSwitch:x.a});var L={name:"Switches",components:{ColorsSwitch:_,FlatSwitch:S,InsetSwitch:C,ModelAsArraySwitch:B,ModelAsBooleanSwitch:E,StatesSwitch:D,LabelSwitch:J}},F=Object(o.a)(L,(function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("v-container",[r("v-col",[r("h1",[t._v("Switches")]),t._v(" "),r("p",{staticClass:"body-1 mt-2"},[t._v("\n            The "),r("code",[t._v("v-switch")]),t._v(" component provides users the ability to choose between two distinct values. \n            These are very similar to a toggle, or on/off switch, though aesthetically different than a checkbox.\n        ")])]),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            Colors switches\n        ")]),t._v(" "),r("ColorsSwitch",{attrs:{id:"ColorsSwitch"}})],1),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            Flat switches\n        ")]),t._v(" "),r("FlatSwitch",{attrs:{id:"FlatSwitch"}})],1),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            Inset switches\n        ")]),t._v(" "),r("InsetSwitch",{attrs:{id:"InsetSwitch"}})],1),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            Model as array switches\n        ")]),t._v(" "),r("ModelAsArraySwitch",{attrs:{id:"ModelAsArraySwitch"}})],1),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            Model as boolean switches\n        ")]),t._v(" "),r("ModelAsBooleanSwitch",{attrs:{id:"ModelAsBooleanSwitch"}})],1),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            States switches\n        ")]),t._v(" "),r("StatesSwitch",{attrs:{id:"StatesSwitch"}})],1),t._v(" "),r("v-col",[r("p",{staticClass:"text-h5"},[t._v("\n            Label switches\n        ")]),t._v(" "),r("LabelSwitch",{attrs:{id:"LabelSwitch"}})],1)],1)}),[],!1,null,null,null);e.default=F.exports;l()(F,{VCol:h.a,VContainer:f.a})}}]);