(function($, parent, window, document, undefined) {

	var

		// Namespace.
		self = parent.Blog = parent.Blog || {},

		baseAppUrl = parent['baseAppUrl'],
		api = parent['api'],

		init = function() {
            $('pre').addClass('prettyprint');
        };

    init();

})(jQuery, Kolich || {}, this, this.document);
