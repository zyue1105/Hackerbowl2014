    $(document).ready(function() {
        console.log("in ready");
        console.log($('svg title'));
        $('svg title').parent().tipsy({
            gravity: 'w',
            hoverlock:true,
            html: true,
            fade: true
            //    title: function() { return $(this).find('title').text(); }
        });

//        var zoom = d3.select("#graphic")
//                .call(d3.behavior.zoom().scaleExtent([.5, 3]).on("zoom",redraw));
//        function redraw() {
//            d3.select("#zoomy")
//                    .attr("transform", "translate(" + d3.event.translate + ")" + " scale(" + d3.event.scale + ")");
//        }        
    });